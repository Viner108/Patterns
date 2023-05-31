package refactoring_guru.behavioral.mediator.example.components;

import refactoring_guru.behavioral.mediator.example.mediator.Mediator;
import refactoring_guru.behavioral.mediator.example.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
    private Mediator mediator;
    private ListModel listModel;
    public Filter(){}
    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }
    protected void processComponentKeyEvent(KeyEvent keyEvent){
        String start=getText();
        searchElements(start);
    }
    public void setList(ListModel listModel){
        this.listModel=listModel;
    }
    private void searchElements(String s){
        if (listModel==null){
            return;
        }
        if (s.equals("")){
            mediator.setElementsList(listModel);
            return;
        }
        ArrayList<Note> notes=new ArrayList<Note>();
        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note) listModel.getElementAt(i));
        }
        DefaultListModel<Note> listModel=new DefaultListModel<Note>();
        for (Note note : notes) {
            if (note.getName().contains(s)){
                listModel.addElement(note);
            }
        }
        mediator.setElementsList(listModel);
    }
    public String getName(){
        return "Filter";
    }
}

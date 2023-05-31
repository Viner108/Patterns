package refactoring_guru.behavioral.mediator.example.components;

import refactoring_guru.behavioral.mediator.example.mediator.Mediator;
import refactoring_guru.behavioral.mediator.example.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {
    private Mediator mediator;
    public AddButton(){
        super("Add");
    }
    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }
    protected void fireActionPerformed(ActionEvent actionEvent){
        mediator.addNewNote(new Note());
    }
    public String getName(){
        return "AddButton";
    }
}

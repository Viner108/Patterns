package refactoring_guru.behavioral.memento.example.editor;

import refactoring_guru.behavioral.memento.example.commands.Command;
import refactoring_guru.behavioral.memento.example.history.History;
import refactoring_guru.behavioral.memento.example.history.Memento;
import refactoring_guru.behavioral.memento.example.shapes.CompoundShape;
import refactoring_guru.behavioral.memento.example.shapes.Shape;

import javax.swing.*;
import java.io.*;
import java.util.Base64;

public class Editor extends JComponent {
    private Canvas canvas;
    private CompoundShape allShapes=new CompoundShape();
    private History history;
    public Editor(){
        canvas=new Canvas(this);
        history=new History();
    }
    public void loadShapes(Shape...shapes){
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }
    public CompoundShape getShapes(){
        return allShapes;
    }
    public void execute(Command c){
        history.push(c,new Memento(this));
        c.execute();
    }
    public void undo(){
        if (history.undo()) {
            canvas.repaint();
        }
    }
    public void redo(){
        if (history.redo()){
            canvas.repaint();
        }
    }
    public String backup(){
        try {
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            ObjectOutputStream oss=new ObjectOutputStream(baos);
            oss.writeObject(this.allShapes);
            oss.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
        catch (IOException e){
            return "";
        }
    }
    public void restore(String state){
        try {
            byte[] data=Base64.getDecoder().decode(state);
            ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShapes=(CompoundShape) ois.readObject();
            ois.close();
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException occurred.");
        }catch (IOException e){
            System.out.println("IOException occurred.");
        }
    }
}

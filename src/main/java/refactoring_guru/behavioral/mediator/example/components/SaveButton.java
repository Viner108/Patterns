package refactoring_guru.behavioral.mediator.example.components;

import refactoring_guru.behavioral.mediator.example.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {
    private Mediator mediator;
    public SaveButton(){
        super("Save");
    }
    public void setMediator (Mediator mediator){
        this.mediator=mediator;
    }
    protected void fireActionPerformed(ActionEvent actionEvent){
        mediator.saveChanges();
    }
    public String getName(){
        return "SaveButton";
    }
}

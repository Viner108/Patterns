package refactoring_guru.behavioral.mediator.example.components;

import refactoring_guru.behavioral.mediator.example.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {
    private Mediator mediator;
    public DeleteButton(){
        super("Del");
    }
    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }
    protected void fireActionPerformed(ActionEvent actionEvent){
        mediator.deleteNote();
    }
    public String getName(){
        return "DelButton";
    }
}

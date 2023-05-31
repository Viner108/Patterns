package refactoring_guru.behavioral.mediator.example.components;

import refactoring_guru.behavioral.mediator.example.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TextBox extends JTextArea implements Component {
    private Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }
    protected void processComponentKeyEvent(KeyEvent keyEvent){
        mediator.markNote();
    }
    public String getName(){
        return "TextBox";
    }
}

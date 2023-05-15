package refactoring_guru.сreational.factory_method.example.factory;

import refactoring_guru.сreational.factory_method.example.buttons.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton=createButton();
        okButton.render();
    }
    public abstract Button createButton();
}

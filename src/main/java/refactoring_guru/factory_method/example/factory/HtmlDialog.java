package refactoring_guru.factory_method.example.factory;

import refactoring_guru.factory_method.example.buttons.Button;
import refactoring_guru.factory_method.example.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    public Button createButton(){
        return new HtmlButton();
    }
}

package refactoring_guru.сreational.abstract_factory.example.factories;

import refactoring_guru.сreational.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.сreational.abstract_factory.example.buttons.Button;
import refactoring_guru.сreational.abstract_factory.example.buttons.Mac0SButton;
import refactoring_guru.сreational.abstract_factory.example.checkboxes.Mac0SCheckbox;

public class Mac0SFactory implements GUIFactory {
    public Button createButton() {
        return new Mac0SButton();
    }

    public Checkbox createCheckbox() {
        return new Mac0SCheckbox();
    }
}

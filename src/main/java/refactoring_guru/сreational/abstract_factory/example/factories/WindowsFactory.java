package refactoring_guru.сreational.abstract_factory.example.factories;

import refactoring_guru.сreational.abstract_factory.example.buttons.WindowsButton;
import refactoring_guru.сreational.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.сreational.abstract_factory.example.checkboxes.WindowsCheckbox;
import refactoring_guru.сreational.abstract_factory.example.buttons.Button;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

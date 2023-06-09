package refactoring_guru.сreational.abstract_factory.example.factories;

import refactoring_guru.сreational.abstract_factory.example.buttons.Button;
import refactoring_guru.сreational.abstract_factory.example.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}

package refactoring_guru.behavioral.mediator.example.mediator;

import refactoring_guru.behavioral.mediator.example.components.Component;
import refactoring_guru.behavioral.mediator.example.components.List;
import refactoring_guru.behavioral.template_method.example.networks.Network;

import javax.swing.*;

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}

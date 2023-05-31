package refactoring_guru.behavioral.mediator.example.components;

import refactoring_guru.behavioral.mediator.example.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}

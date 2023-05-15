package refactoring_guru.сreational.abstract_factory.example;

import refactoring_guru.сreational.abstract_factory.example.app.Application;
import refactoring_guru.сreational.abstract_factory.example.factories.GUIFactory;
import refactoring_guru.сreational.abstract_factory.example.factories.Mac0SFactory;
import refactoring_guru.сreational.abstract_factory.example.factories.WindowsFactory;

public class Demo {
    public static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new Mac0SFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

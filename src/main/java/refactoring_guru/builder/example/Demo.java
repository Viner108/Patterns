package refactoring_guru.builder.example;

import refactoring_guru.builder.example.builders.CarBuilder;
import refactoring_guru.builder.example.builders.CarManualBuilder;
import refactoring_guru.builder.example.cars.Car;
import refactoring_guru.builder.example.cars.Manual;
import refactoring_guru.builder.example.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder=new CarBuilder();
        director.constructSportsCar(builder);
        Car car =builder.getResult();
        System.out.println("Car built:\n" + car.getCarTyte());
        CarManualBuilder manualBuilder=new CarManualBuilder();
        builder.constructSportsCar(manualBuilder);
        Manual carManual=manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}

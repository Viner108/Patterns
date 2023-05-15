package refactoring_guru.сreational.builder.example.builders;
import refactoring_guru.сreational.builder.example.cars.CarType;
import refactoring_guru.сreational.builder.example.components.Engine;
import refactoring_guru.сreational.builder.example.components.GPSNavigator;
import refactoring_guru.сreational.builder.example.components.Transmission;
import refactoring_guru.сreational.builder.example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

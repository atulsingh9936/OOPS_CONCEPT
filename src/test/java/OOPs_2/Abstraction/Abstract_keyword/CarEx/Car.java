package OOPs_2.Abstraction.Abstract_keyword.CarEx;

public class Car extends Engine {
    @Override
    void start() {
        System.out.println("Starting the car");

    }

    @Override
    void stop() {
        System.out.println("stop the car");

    }

    @Override
    void partGearbox() {
        System.out.println("Assemble the gearbox");

    }

    @Override
    void OpenCar() {
        System.out.println("Open the car");

    }
}

package OOPs_2.Abstraction.Interfacekeyword;

public class Car implements Brake,Engine{
    @Override
    public void ApplyBrake() {
        System.out.println("Applying brake");

    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");

    }
}

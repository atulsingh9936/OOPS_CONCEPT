package OOPs_2.Hierarichical.ex1;

public class Vehicle {
    Vehicle(){
        System.out.println("DC vehicle");
    }

    void vehicleTopSpeed(){
        System.out.println("Yeah from"+ getClass().getSimpleName());
    }
}

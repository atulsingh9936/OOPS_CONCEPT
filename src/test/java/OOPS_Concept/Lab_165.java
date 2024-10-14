package OOPS_Concept;

public class Lab_165 {
    public static void main(String[] args) {
        car tesla = new car();
        tesla.name = "Tesla";
        tesla.model= "Model 3";
        tesla.reverse();
        tesla.speed();

        car Volvo = new car();
        Volvo.name = "Volvo";
        Volvo.model= "Polo";
        Volvo.reverse();
        Volvo.speed();
    }
}

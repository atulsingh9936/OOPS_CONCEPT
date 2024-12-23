package Ex_18052024.Poly.method_overloading;

public class Lab_189 {
    // method overloading - Multiple methods with same name, but different arguments
    void gift (String a ){
        System.out.println("A is a string "+ a);
    }

    int gift(int x){
        System.out.println("X is an Int"+ x);
        return x;
    }

    int gift(float x){
        System.out.println("X is an Int"+ x);
        return 89;

    }

    void gift(double x){
        System.out.println("X is a double"+ x);
    }

    public static void main(String[] args) {
        Lab_189 p = new Lab_189();
        p.gift(10);
        p.gift("parmod");
    }
}

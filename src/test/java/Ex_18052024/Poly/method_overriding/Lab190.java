package Ex_18052024.Poly.method_overriding;

public class Lab190 {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.bark();
//
//        Hound h = new Hound();
//        h.bark();

        Dog d1 = new Hound(); // dynamic dispatch - runtime polymorphism
        d1.bark();
    }
}

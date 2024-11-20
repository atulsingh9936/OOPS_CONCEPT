package OOPS_Concept.Inheritance.singleinheritance;

public class Runner_class_174 {
    public static void main(String[] args) {
        Programming p = new Programming(12,"danis");
        Java j = new Java("Lamda expression");
       p.printinfo();
       j.printinfo();

       Programming p1 = new Programming(12,"Van Russom");
               p1.printinfo();

               Python python = new Python();
               python.printinfo();
    }
}

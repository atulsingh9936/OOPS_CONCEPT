package OOPS_Concept.Inheritance.multilevel;

public class Runner_class {
    public static void main(String[] args) {

//    child child = new child();
//    child.home();
//
//
//    Grandfather grandfather = new Grandfather();
//    grandfather.home();
//
//
//    Father father = new Father();
//    father.home();


        // dynamic dispatch

        Grandfather grandfather1 = new Grandfather();
        Grandfather grandfather = new Father();
        Grandfather grandfather2  = new Child();


        Father f1 = new Child();
        f1.home();


// Grandfather grandfather = new Child();
// grandfather.home();




    }
}

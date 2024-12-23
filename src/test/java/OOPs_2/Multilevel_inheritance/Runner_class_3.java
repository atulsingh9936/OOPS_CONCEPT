package OOPs_2.Multilevel_inheritance;

public class Runner_class_3 {
    public static void main(String[] args) {

//        child c = new child();
//        c.home();


//        Grandfather_1 grandfather1 = new Grandfather_1();
//        grandfather1.home();

//        Father_1 father1= new Father_1();
//        father1.home();
//
//        child child = new child();
//        child.home();

        // dynamic dispatch

        Grandfather_1 grandfather2 = new Grandfather_1();
        Grandfather_1 grandfather3 = new Father_1();
        Grandfather_1 grandfather4 = new child();


        Father_1 father1 = new child();

        Grandfather_1 grandfather1 = new child();
        grandfather1.home();


    }
}

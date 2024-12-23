package OOPs_2.single_inheritance;

public class Runner_class {
    public static void main(String[] args) {


        Programming_1 programming1 = new Programming_1(12,"KO POSAN");
        Java_1 java1= new Java_1("lamba expresion");
        programming1.Printinfo();
        java1.Printinfo();


        Programming_1 programming11 = new Programming_1(12,"Van Russom");
        programming11.Printinfo();


        Python_1 python1 = new Python_1();
        python1.Printinfo();


    }
}

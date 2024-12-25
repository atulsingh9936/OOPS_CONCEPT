package OOPs_2.static_keyword;

import OOPs_2.Hierarichical.ex1.Car;

public class Lab_201 {
    public static void main(String[] args) {
//        ATB amit = new ATB("90786767");
//        ATB pramod = new ATB("9634767567");
//
//        amit.printDetails();
//        pramod.printDetails();
//        System.out.println(amit.coursename);
        ATB ashok = new ATB("6473468634");
        ATB munni = new ATB("45343445");

//

    }

}

class ATB{

    static{

        System.out.println("i will be executed when class is loaded"); // load one time , when class is loaded

    }

    {
        System.out.println("Instance initialization block: loaded when object is created");
    }

    static String coursename ="ATB"; // static variable
    String phoneno;// instance variable

    public ATB(String phoneno) {
        this.phoneno = phoneno;
    }
    public void printDetails(){
        System.out.println("your details :" +  this.phoneno);
    }
}

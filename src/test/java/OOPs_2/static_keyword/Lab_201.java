package OOPs_2.static_keyword;

import OOPs_2.Hierarichical.ex1.Car;

public class Lab_201 {
    public static void main(String[] args) {
        ATB amit = new ATB();
        amit.id = "1";
        System.out.println(amit.coursename);

    }

}


class ATB{

    static String coursename ="Atb";
    String id;

}

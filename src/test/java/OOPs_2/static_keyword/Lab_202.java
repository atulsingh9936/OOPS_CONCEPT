package OOPs_2.static_keyword;

public class Lab_202 {
    public static void main(String[] args) {
        Person p = new Person("Amit");
        Person p1 = new Person("Pramod");

        System.out.println(Person.Footballclub);


        // static function can be called by
        // className
        Person.m1();
        p.m1();
        p1.m1();
        Person.Footballclub = "manu";
        System.out.println(p.Footballclub);
        System.out.println(p1.Footballclub);


        // non static - reference
        p.m2();
        p1.m2();



    }

}

class Person{
   static String Footballclub ="Arsenal";

   static{
       System.out.println("once , when class is loaded");
   }

   {
        System.out.println("IIB");
    }

    // static function

    static void m1(){
        System.out.println("i am common function");
    }
     // non static function
    void m2(){
        System.out.println("person -> "+this.name);
    }

    String name; //  non static

    public Person(String name) {
        this.name = name;
    }
}

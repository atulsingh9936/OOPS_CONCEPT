package OOPS_Concept;

public class Person {

    // Attribute
    String name;
    byte age;
    long phone_no;
    String[] address;
    double height;
    boolean isMale;
    float salary;
    String dob;
    String eye_color;

    // Behave/functionality
    void walk(){
        System.out.println("I cam walk");
    }
    void talk(String msg){
        System.out.println("I will say"+ msg);
    }

    String sleep(){
        return "sleep";
    }
    String eat(String item){
        return item;

    }
}

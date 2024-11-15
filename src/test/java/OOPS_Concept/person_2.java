package OOPS_Concept;

public class person_2 {
    String name;
    int age;

    //Parameterized constructor

    person_2 (String name, int age){
        this.name= name;
        this.age = age;

    }

    person_2(person_2 person){
        this.name = person.name;
        this.age  = person.age;
    }


    public static void main(String[] args) {
        person_2 person1 = new person_2("john",21);
        person_2 person2 = new person_2(person1);
        person_2 person3 = new person_2(person1);
        person_2 person4 = new person_2(person1);
        System.out.println(person2.name+"is"+person2.age +"years old");
        System.out.println(person2.name+"is"+person2.age +"years old");

    }
}

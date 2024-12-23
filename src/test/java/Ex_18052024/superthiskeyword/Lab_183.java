package Ex_18052024.superthiskeyword;

public class Lab_183 {
    public static void main(String[] args) {
        student1 sc1= new student1();


    }
}

class person1{

    person1(){
        System.out.println("Person1 - DC");
    }
    person1(String a1){
        System.out.println("Person1-PC1");
    }
    person1(String a, int a1){
        System.out.println("Person1-PC");
    }

}

class  student1 extends person1 {
    student1(String a1){
        System.out.println("pc-student");
    }

    student1(){
       // super("pramod");
       //super("pramod",13);
        // this("parmod");
        System.out.println("Student 1 - DC");

    }
}

package OOPS_Concept.Inheritance.singleinheritance;

public class Programming {

    int version;
    String author;


    public Programming() {

        System.out.println("DC");
    }
    public Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }

    void printinfo(){
        System.out.println("Program info ->"+ this.version +"Author"+"->" +this.author);
    }

    void bhk3(){
        System.out.println("3BHK");
    }

}

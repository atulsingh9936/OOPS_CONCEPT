package OOPs_2.single_inheritance;

public class Programming_1 {


    int version;
    String author;

     Programming_1() {
         System.out.println("DC");
    }


     Programming_1(int version, String author) {
        this.version = version;
        this.author = author;
    }

    void Printinfo(){
        System.out.println("Program info ->"+ this.version + "Author-->"+ this.author);
    }
     void bhk3(){
         System.out.println("3BHK");
     }




}

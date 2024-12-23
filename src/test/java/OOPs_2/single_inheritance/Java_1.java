package OOPs_2.single_inheritance;

public class Java_1 extends Programming_1 {
    // single inheritance - is A
    // Java is a Programming language
    //Python is a Programming language



    String newFeature;
    // int version;
    //String author;
    public Java_1() {
        System.out.println("DC");
    }

    public Java_1(String newFeature) {
        this.newFeature = newFeature;
    }

    void Printinfo(){
        System.out.println("Feature is -> "+ this.newFeature);
        bhk3();
    }


}

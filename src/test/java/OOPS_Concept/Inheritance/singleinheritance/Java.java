package OOPS_Concept.Inheritance.singleinheritance;

public class Java extends Programming {

    String newFeature;
    public Java() {
        System.out.println("DC");
    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }

    void printinfo(){
        System.out.println("feature is -> "+ this.newFeature);
        bhk3();
    }
}

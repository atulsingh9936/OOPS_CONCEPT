package Ex_18052024.superthiskeyword;

public class Lab_185 {
    public static void main(String[] args) {
     //   dog d1 = new dog();
      //  dog d2 = new dog("Labrador");
        dog d3 = new dog("golden retrieval","DOG TT");

        d3.display();
        // constructor chaining ->child dc, parent's dc

    }

}

class Animal{
    String type;
    public Animal() {
        System.out.println("Animal DC");
    }

    Animal(String type){
        this.type = type;
        System.out.println("animal pc");
    }


}

class dog extends Animal{
    String breed;
    dog(){
        System.out.println("dog dc");
    }

    public dog(String breed) {
        super("dog type");
        this.breed = breed;
    }
    public dog(String breed,String type) {
        super(type);
        this.breed = breed;
        System.out.println("Pc with two args");
    }

    void display(){
        System.out.println("Type:"+ super.type+","  + "Breed:"+this.breed);
    }
}

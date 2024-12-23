package Ex_18052024.superthiskeyword;

public class Lab_182 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }

}

class student extends person{
    // is a relationship - inheritance
    void message(){
        System.out.println("I am Student message");
    }

    void display(){
        this.message();
        //super.message();
    }
}

class person{
    void message(){
        System.out.println("I am person message");
    }
}

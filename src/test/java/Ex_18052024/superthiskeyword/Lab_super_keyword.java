package Ex_18052024.superthiskeyword;



public class Lab_super_keyword {

    public static void main(String[] args) {
        // Super keyword in java
        // parent- child
        // super keyword is a reference to parent class
        // it can refer three things
        // Variable of the parent
        // Method of the parent
        // constructor of the parent
        car c = new car();
        int c1 =c.max_speed;
        System.out.println(c1);
        c.display();
    }

    }

    class vehicle {
        int max_speed = 100; // instance variable

        void message() {
            System.out.println("This is a Vehicle class");
        }
    }

        class car extends vehicle {
            int max_speed = 10;

            void display() {
                System.out.println("Max speed of Vehicle can be" + super.max_speed);
                System.out.println("Max speed of Car can be" + this.max_speed);

        }
    }

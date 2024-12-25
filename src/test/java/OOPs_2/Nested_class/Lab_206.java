package OOPs_2.Nested_class;

public class Lab_206 {
    public static void main(String[] args) {
        car c = new car ("lambo");


        car.Engine engine = c.new Engine("440cc");

        engine.start();
        c.drive();

        // To shilled the inner class
    }
}


class car{
    String make;

    public car(String make) {
        this.make = make;
    }

    // method
    void drive(){
        System.out.println("You can drive the car");
    }

    class Engine{
        // instance variable
        String horsepower;

        public Engine(String horsepower) {
            this.horsepower = horsepower;
        }

        void start(){
            System.out.println("Engine is started!!->>"+ make);
        }

        class gearbox{
            void m2(){
                System.out.println("m2");
            }
            class pp{
                class oo{}
            }
        }
    }
}

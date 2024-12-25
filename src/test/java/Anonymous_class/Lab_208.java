package Anonymous_class;

public class Lab_208 {
    public static void main(String[] args) {
        ABC abc = new ABC() {
            @Override
            void m1() {
                System.out.println("M1");

            }
        };
        abc.m1();

       i1 i = new i1() {
           @Override
           public void m2() {
               System.out.println("M2");
           }
       };
       i.m2();



    }
}

//class Anomy extends ABC {
//    @Override
//    void m1(){
//
//    }
//}



abstract class ABC{
    abstract void m1();
}

interface i1{
    void m2();
}
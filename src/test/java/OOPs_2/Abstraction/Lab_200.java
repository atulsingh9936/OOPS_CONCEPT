package OOPs_2.Abstraction;

public class Lab_200 {


}
class Pramod extends B1{
    @Override
    void mtb() {

    }

    @Override
    public void atb() {

    }
}

abstract class B1 implements course{
   abstract void mtb();


}




interface course{
    void atb();
}

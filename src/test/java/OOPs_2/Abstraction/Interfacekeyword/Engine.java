package OOPs_2.Abstraction.Interfacekeyword;

public interface Engine {
    void startEngine();
    void stopEngine();

    default  void halting_engineJuststart(){
        System.out.println("Halt the engine");
    }

    default  void halting_engineJuststop(){
        System.out.println("Halt the engine");
    }

    static void m1(){
        System.out.println("M1");
    }
}

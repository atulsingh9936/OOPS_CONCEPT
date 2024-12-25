package OOPs_2.Nested_class;

public class Lab_207 {
    public static void main(String[] args) {
     // ooc oc =new ooc();
      ooc.SNIC snic = new ooc.SNIC();
    }

}

class ooc{
    static int o =10;
    int  oa =20;


    static  class SNIC{
        void show(){
            System.out.println(o);
           // System.out.println(oa);  Non static member cant be accessed in static class
        }
    }
}

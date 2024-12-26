package Wrapper_class;

public class lab_211 {
    public static void main(String[] args) {
        int x =123;
       // String s1 = x;
      //  String s1 = (String) x;
        String s1 = String.valueOf(x);
        System.out.println(s1);


//        Character  ch ='a';  // Wrapper class
//
//        char a3 = 'A'; // primitive


        Character ch = 'a';
        char a3 = ch ;  // Wrapper to primitive- unboxing - Automatically
        Boolean b = true;
        Long l = 34l;
        Double d1=23.0;
        Float f1 = 90.89f;

        // Wrapper class is user to covert primitive data types into objects

        Integer intObject = Integer.valueOf(5);
        System.out.println(intObject);

        Integer a2 = 89; // Autoboxing (Primitive -> Wrapper(Automatically)


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(1,6));
        System.out.println(Integer.min(2,7));

        Integer a11 = new Integer(10); //
        Integer a12 = Integer.valueOf(10);










    }
}

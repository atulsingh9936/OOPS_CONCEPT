package Exceptions;

public class Lab_222 {
    public static void main(String[] args) {
       try{
           String s1 = "pramod";
           String a1 = args[0];
           int a=10/0;
           s1 = null;
           System.out.println(s1.trim());
       } catch(NullPointerException|ArithmeticException | ArrayIndexOutOfBoundsException e){
           System.out.println("s1 is null");
       }
    }
}

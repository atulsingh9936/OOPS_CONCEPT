package Exceptions;

public class Lab_211 {
    public static void main(String[] args) {
        try{
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b =10/a;
            System.out.println(a);
            System.out.println(b);
        }catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("problem with the code");
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
    }
}

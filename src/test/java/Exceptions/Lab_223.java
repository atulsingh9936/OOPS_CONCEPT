package Exceptions;

public class Lab_223 {
    public static void main(String[] args) {

        try{
            int a =0;
            int x = 10/a;
        }catch(Exception e){
            System.out.println("Exit");
        }finally{
            System.out.println("I ma final");
        }

    }
}

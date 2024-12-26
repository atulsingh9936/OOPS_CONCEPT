package Exceptions;

public class Lab_219 {
    public static void main(String[] args) {
        String sh =   args[0];
        int x = Integer.parseInt(sh); //(string) 100 -> 100(int)
        int a = 10/x;
        System.out.println(x);
        System.out.println(a);
    }
}

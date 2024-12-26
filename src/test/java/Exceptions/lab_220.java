package Exceptions;

import java.io.FileInputStream;

public class lab_220 {
    public static void main(String[] args) {
        // exception
        // checked   - jvm
        // compile time - jvm , If knows about it - checked exception

       // FileInputStream f = new FileInputStream("c:/loh.txt");
        // file io - open
      try {
          FileInputStream f = new FileInputStream("c:/loh.txt");
      }catch(Exception e){
          System.out.println(e.getMessage());
      }



        // unchecked - jvm doesnt know
        int a =10;
        int c =a/0;
        System.out.println(c);

        String s1 = null;
        s1.trim();

    }
}
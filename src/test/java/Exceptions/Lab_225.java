package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Lab_225 {
    public static void main(String[] args) {
        readfile("c://a.txt");

    }

    static void readfile(String filename){
        int a =10/10;
        int c = 0;
        int a1 = 10/c;
      try {
          FileReader f = new FileReader(new File("c:a.txt"));
      }catch(Exception e){
          System.out.println("file not found");
      }
    }
}

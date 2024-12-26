package Exceptions;

public class Bank_2 {
    public static void main(String[] args) throws Exception {

        Bank sbi = new Bank("INR",100);
        Bank jpmorgan = new Bank("USD",10);
        Integer total =   sbi.add(jpmorgan);
        System.out.println(total);
    }
}

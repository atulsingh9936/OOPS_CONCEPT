package OOPS_Concept;

public class Bank_Acoount {


    String bankName;
    int balance;
    String bankCode;

    Bank_Acoount(){
        bankName="SBI";
        bankCode="SBI001";
        balance=0;
    }
    public Bank_Acoount(String bankName, int balance, String bankCode) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }
    public Bank_Acoount(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    void printDetails(){
        System.out.println("Bank Name-> "+balance);
        System.out.println("Bank Name-> "+bankCode);
        System.out.println("Bank Name-> "+bankName);

    }
}

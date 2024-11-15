package OOPS_Concept;

public class Runner_class_bank_account {
    public static void main(String[] args) {


        Bank_Acoount sbi_ref= new Bank_Acoount();
        sbi_ref.printDetails();
        Bank_Acoount hdfc_ref = new Bank_Acoount("HDFC",10,"HDFC001");
        hdfc_ref.printDetails();
        Bank_Acoount icici_ref = new Bank_Acoount("Icici",0,"ICICI010");
        icici_ref.printDetails();

        Bank_Acoount yesbank = new Bank_Acoount("yesbank","Yesbank2023");
        yesbank.printDetails();

//        Bank_Acoount hdfc_ref = new Bank_Acoount("HDFC",10,"HDFC001");
//        hdfc_ref.printDetails();
    }
}

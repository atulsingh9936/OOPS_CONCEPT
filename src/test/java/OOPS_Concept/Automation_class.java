package OOPS_Concept;

public class Automation_class {
    Automation_class(){
        databaseconnection();
        excelopen();
    }

    void databaseconnection(){
        System.out.println("my sql connection is created");
    }

    void excelopen(){
        System.out.println("Excel opened");
    }


    void testcase1(){
        System.out.println("TC1");
    } void testcase2(){
        System.out.println("TC2");
    }


    public static void main(String[] args) {
        Automation_class a = new Automation_class();
        a.testcase1();
        a.testcase2();

    }
}

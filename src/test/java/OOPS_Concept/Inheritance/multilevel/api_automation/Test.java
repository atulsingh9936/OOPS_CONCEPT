package OOPS_Concept.Inheritance.multilevel.api_automation;

public class Test extends BaseTest{

    void accessExcelandSQl(){
        openExcelfile();
        opensqlconnection();
        System.out.println(version);
        System.out.println(Api_version);
    }
    int version =88;

    void openJson(){
        System.out.println("Test");
    }
}

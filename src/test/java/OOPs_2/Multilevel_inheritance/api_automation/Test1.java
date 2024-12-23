package OOPs_2.Multilevel_inheritance.api_automation;

public class Test1 extends Base_Test1 {

    void accessExcelAndSQL(){
        openExcelfile();
        openSQLConnection();
        System.out.println(Api_Version);
        System.out.println(version);
    }

    void openJson(){
        System.out.println("Test");
    }
}

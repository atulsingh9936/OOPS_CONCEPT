package OOPs_2.Multilevel_inheritance.api_automation;

public class Runner_Class_5 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.openExcelfile();
        test1.openExcelfile();
        int a = test1.Api_Version;

        Common_to_all_1 commonToAll1= new Test1();
        commonToAll1.openExcelfile();
        commonToAll1.openJson();
    }
}

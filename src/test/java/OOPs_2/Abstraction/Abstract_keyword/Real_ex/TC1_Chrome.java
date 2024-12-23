package OOPs_2.Abstraction.Abstract_keyword.Real_ex;

public class TC1_Chrome extends Base_class {
    @Override
    String openbrowser() {
        System.out.println("Starting Chrome......");
        return "";
    }

    @Override
    String closebrowser() {
        System.out.println("closing chrome...");
        return "";
    }
}

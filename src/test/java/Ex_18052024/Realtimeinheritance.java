package Ex_18052024;

public class Realtimeinheritance {
    public static void main(String[] args) {

    }


    class Baseclass{

        private String browser;

        public String getBrowser() {
            return browser;
        }

        public void setBrowser(String browser, boolean isauth) {
            if(isauth) {
                this.browser = browser;
            }else{
                System.out.println("not allowed");
            }
        }

        void openBrowser(){
            System.out.println("chrome browser!!");
        }
        void openBrowser(String browserName){
            System.out.println("open browser !!--> "+browserName);
        }
        void CloseBrowser(){
            System.out.println("open browser!!");
        }
    }
}

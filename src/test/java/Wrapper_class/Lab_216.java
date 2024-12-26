package Wrapper_class;

public class Lab_216 {
    public static void main(String[] args) {
        API_endpoints e = API_endpoints.LOGIN;
        switch (e){
            case LOGIN: System.out.println("login page code should be executed");
            break;
            case DASHBOARD: System.out.println("Dashboard page code should be executed");
        }


    }

}

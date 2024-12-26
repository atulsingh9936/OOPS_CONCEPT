package Wrapper_class;

public class Lab_127 {
    public static void main(String[] args) {
        // only test case related to login
        API_endpoints ref = API_endpoints.LOGIN;
        System.out.println(ref.getPage());
        System.out.println(ref.getUrl());
    }
}

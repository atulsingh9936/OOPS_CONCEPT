package Ex_18052024.Encapsulation;

public class lab_192 {
    public static void main(String[] args) {
        vwologin1 v1 = new vwologin1("admin","admin123");
       // v1.username ="admin";
        String username = v1.getUsername();
       // String password = v1.getPassword(true);
         v1.setPassword("pramod",true);


    }

}

class vwologin1{
    private String username;
    private String password;

    public vwologin1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isauth) {
        if (isauth) {
            return password;
        } else {
            return  "not allowed";
        }
    }

    public void setPassword(String password,boolean isAuth) {
        if(isAuth) {
            this.password = password;
        }else {
            System.out.println("not allowed");
        }
    }
}

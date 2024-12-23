package Ex_18052024.Encapsulation;

public class Lab_191 {
    public static void main(String[] args) {
        vwologin v1 = new vwologin("admin","admin123");

//        System.out.println(v1.password);
//        v1.username = "amit";
       System.out.println(v1.username);

    }

}
class vwologin{
 public String username;
   private String password;

    public vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

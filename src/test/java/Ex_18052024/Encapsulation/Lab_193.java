package Ex_18052024.Encapsulation;

public class Lab_193 {
    public static void main(String[] args) {
        Icicibank i = new Icicibank("atul",10);
        System.out.println(i.getBal());
        i.setBal(-100);
        System.out.println(i.getBal());
    }
}

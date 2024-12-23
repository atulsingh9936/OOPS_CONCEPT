package Ex_18052024.Encapsulation;

public class Icicibank {

  private   String name;
  private   long bal;

    public Icicibank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if(bal>0) {
            this.bal = bal;
        }else{
            System.out.println("not allowed");
        }
    }
}

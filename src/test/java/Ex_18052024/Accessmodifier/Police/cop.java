package Ex_18052024.Accessmodifier.Police;

public class cop {
    public int gun; // public access by anyone
    private String idCard;// private -only available to the cop

    public cop(int gun){
        this.gun = gun; // pc
    }
    protected void canIshoot(){
        System.out.println("Ofcourse,Shoot!");
    }
}

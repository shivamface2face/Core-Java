package Oops;

public class Inheritance {
    public static void main(String[] args) {
               bike b1=new bike(2,3,4);
        b1.SpeendUp(23);

    }
}

class ByCycle{
  public   int speed;
    public int gear;

    public ByCycle(int speed,int gear){

    }
    public void  ApplyBreak(int Decreament){

    }
    public void SpeendUp(int increament ){

    }
    public void   printInfo(){
        System.out.println("hell");
    }

}
class bike extends ByCycle{
    public  int setHeight;

    public bike(int speed, int gear,int setHeight) {
        super(speed, gear);
        setHeight=setHeight;
    }

    public void setSetHeight(int setHeight) {
        this.setHeight = setHeight;
    }
}
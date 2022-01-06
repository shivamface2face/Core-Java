package Oops;
// encapslation is hiding of data member and function
//t is the mechanism that binds together code and the data it manipulates
class  Student{
    private  int roll;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }
}

public class Encapslation {
    public static void main(String[] args) {
  Student s1=new Student();
        s1.setRoll(23);
        int res=s1.getRoll();
        System.out.println(res);
    }
}

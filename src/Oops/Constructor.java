package Oops;

public class Constructor {
    public static void main(String[] args) {
     point p=new point(7,8);
     p.print();

    }
}

class point{
    int x,y;

    point(int a,int b){
        x=a;
        y=b;

    }
    public  void print(){
        System.out.println("value of x is  "+ x+" y ki value hai "+ y);
    }
}
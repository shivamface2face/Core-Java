package Oops;

class  A{

}

class B extends  A{
//    @Override
    public void walk() {
        System.out.println("b is walking");
    }
}

class C extends B{
    public void walk() {
        System.out.println("C is walking");
    }
}



public class Polimorphism {
    public static void main(String[] args) {
        C c=new C();
        B b1=c;

        A a=c;
        c.walk();
        b1.walk();
//        a.walk();
    }
}

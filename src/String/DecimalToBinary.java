package String;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str="";

        while (n>0){
            str=(n%2)+str;
            n=n/2;
        }
        System.out.println(str);
    }
}

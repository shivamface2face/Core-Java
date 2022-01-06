package String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String rev="";

        int ptr=str.length()-1;
        while (ptr>=0){
            rev=rev+str.charAt(ptr);
            ptr--;
        }
        System.out.println(rev);
    }
}

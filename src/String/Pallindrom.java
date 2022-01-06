package String;

import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int start=0;
        int end=str.length()-1;
        boolean isPal=true;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                isPal=false;
                break;
            }
            start++;
            end--;
        }
        if (isPal==true){
            System.out.println("yes it is");
        }else {
            System.out.println("nope ");
        }

    }
}

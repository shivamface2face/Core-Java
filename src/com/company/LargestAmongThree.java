package com.company;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
      int ans=AnotherWay(a,b,c);
        System.out.println(ans);
        if (a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }

    }

  static int AnotherWay(int a, int b, int c) {
        int ans1=Math.max(a,b);
        int ans2=Math.max(ans1,c);
        return ans2;

    }
}

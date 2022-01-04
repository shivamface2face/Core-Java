package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
//        process
        /*

        1- get the min of two number min(a,b)
        2- iratate over 1 to min and find any number divide the both a and b

         */

        int ans=1;
        int x=Math.min(a,b);
        for (int i = 1; i <x ; i++) {
            if (a%i==0 && b%i==0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}

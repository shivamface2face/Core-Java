package com.company;

import java.awt.*;
import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();

        int ans=firstdigit(n);
        System.out.println(ans);
        System.out.println(ffdigit2(n));
    }

       static int ffdigit2(int n) {
        while (n>10){
            n=n/10;
        }
        return n;
    }

    static int firstdigit(int n) {
        double power=Math.log10(n);
        int p=(int)power;
        int a=(int)Math.pow(10,p);
        return n/a;

    }

}

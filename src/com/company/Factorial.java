package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int i=1;
        while (n>0){
            i=i*n;
            n--;
        }
        System.out.println(i);
    }
}

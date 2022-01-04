package com.company;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();

        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                System.out.println("not a prime no");
                break;
            }else {
                System.out.println("n is  a prime no");
                break;
            }
        }
    }
}

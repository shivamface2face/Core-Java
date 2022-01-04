package com.company;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        primefactor(n);
    }

     static void primefactor(int n) {
         for (int i = 2; i < n; i++) {
              if (isPrime(i)){
                  int x=i;
                  while (n%x==0){
                      System.out.println(i);
                      x=x*i;
                  }

              }
         }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (j % n == 0) {
                return false;
            }
        }


            return true;


    }


}

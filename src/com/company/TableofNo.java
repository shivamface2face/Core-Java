package com.company;

import java.util.Scanner;

public class TableofNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(i*n);
            i++;
        }
    }
}

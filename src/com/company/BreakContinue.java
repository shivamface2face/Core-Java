package com.company;

public class BreakContinue {
    public static void main(String[] args) {

//        continue
        for (int i = 0; i < 5; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
//        break

        for (int i = 0; i < 5; i++) {
            if (i==3){
                break;
            }
            System.out.println(i);
        }
    }
}

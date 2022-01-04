package ArrayBasic;

import java.util.Scanner;

public class CoutDistinctEle {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println(isDistincnt(arr));
    }

       static int isDistincnt(int[] arr) {

        int count=0;
        boolean isDistinct=true;
           for (int i = 0; i < arr.length; i++) {
               for (int j = i-1; j >=0 ; j--) {
                   if (arr[i]==arr[j]){
                       isDistinct=false;
                       break;
                   }
               }

               if (isDistinct==true){
                   count++;
               }
               isDistinct=true;
           }
           return count;
    }
}

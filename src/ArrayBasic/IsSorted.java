package ArrayBasic;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }

        System.out.println(isSorted(arr));
    }

      static boolean isSorted(int[] arr) {
          for (int i = 1; i < arr.length; i++) {
              if (arr[i]<arr[i-1]){
                  return false;
              }
          }
          return true;
    }
}

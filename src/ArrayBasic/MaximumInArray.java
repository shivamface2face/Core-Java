package ArrayBasic;

import java.util.Arrays;

public class MaximumInArray {
    public static void main(String[] args) {
          int arr[]={2,8,4,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i]>max){
              max=arr[i];
          }
        }
        System.out.println(max);
    }
}

package ArrayBasic;

public class SumofArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}

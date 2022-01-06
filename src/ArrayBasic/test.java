package ArrayBasic;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        while(t>0){

            int n=in.nextInt();
            int k=in.nextInt();
            int count=0;

            for (int i=0;i<n ;i++ ){
                int p=in.nextInt();
                if(p>k){
                    count++;
                }
            }
            System.out.println(count);
            t--;

        }

    }
}

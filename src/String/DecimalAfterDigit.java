package String;

public class DecimalAfterDigit {
    public static void main(String[] args) {
        String no="12.385";

        String ans=serch(no);
        System.out.println(ans);
    }

      static String serch(String no) {
        int pos=no.indexOf(".");
        if (pos<0){
            return "";
        }else {
            return no.substring(pos);
        }
    }
}

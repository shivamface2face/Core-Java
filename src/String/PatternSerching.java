package String;

public class PatternSerching {
    public static void main(String[] args) {
        String txt="geeks for geeks";
        String pat="geeks";

        SerchPat(txt,pat);
    }

        static void SerchPat(String txt, String pat) {
        int pos=txt.indexOf(pat);

        if (pos<0){
            return;
        }else {
            System.out.println(pos);
            pos=txt.indexOf(pat,pos+1);
        }
    }
}

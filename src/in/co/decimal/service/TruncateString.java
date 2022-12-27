package in.co.decimal.service;

public class TruncateString {
    public static String truncateString(String s, int k){
        String str[] = s.split(" ");
        String str1 = "";
        for(int i=0; i<k; i++){
            str1 += str[i]+" ";
        }
        return str1.trim ();
    }
    public static void main(String[] agrs){
        String s = "Hello how are you Contestant";
        int k = 4;
        String result = truncateString(s, k);
        System.out.println(result);
    }

}

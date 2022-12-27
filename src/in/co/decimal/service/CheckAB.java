package in.co.decimal.service;



import java.util.Scanner;

public class CheckAB {
    public static boolean checkAB(String str, int si){
        if(si >= str.length()){
            return true;
        }
        if(str.charAt (si) == 'a'){
            if((si+2 < str.length()) && (str.charAt (si+1) == 'b' && str.charAt (si+2) == 'b')){
                return checkAB (str, si+3);
            }else{
                return checkAB (str,si+1);
            }
        }else{
            return false;
        }
    }
    public static boolean checkAB(String str){
        return checkAB (str, 0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String str = scan.next ();
        boolean result = checkAB(str);
        System.out.println (result);
    }

}

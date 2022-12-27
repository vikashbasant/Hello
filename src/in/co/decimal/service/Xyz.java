package in.co.decimal.service;
import java.util.Scanner;
public class Xyz {

    public static String removeConsecutiveElement(String str){
        // Base Case:
        if(str.length() <= 1){
            return str;
        }

        // Induction Hypothesis:
        String smallAns = removeConsecutiveElement(str.substring(1));

        // Induction Step:
        if(str.charAt(0) != smallAns.charAt(0)){
            smallAns = str.charAt(0)+smallAns;
        }

        return smallAns;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = removeConsecutiveElement(str);
        System.out.println(result);

        System.out.println ('a'-'a');
    }
}

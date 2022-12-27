package in.co.decimal.service;

import java.util.Scanner;


/**
 * Check Weather Number is Palindrome or not:
 * Base Case:
 * Induction Step:
 * Induction Hypothesis:
 */
public class Recursion {

    public static int reverseNumber(int num, int sum){
        // Base Case:
        if(num == 0){
            return sum;
        }

        // Induction Step:
        sum = sum * 10 + num%10;

        // Induction Step:
        int smallOutput = reverseNumber(num/10, sum);
        return smallOutput;
    }

    public static boolean isPalindromeNumber(int num){

        if(reverseNumber(num, 0) == num){
            return true;
        }

        return false;
    }

    public static String reverseString(String str, int si){
        //Base Case:
        if(si >= str.length()){
            return "";
        }

        // Induction Step:
        if(str.charAt (si) == 'x'){
            return reverseString (str, si+1);
        }else{
            return str.charAt(si)+reverseString (str, si+1);
        }

    }
    public static String reverseString(String str){
        return reverseString(str, 0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(isPalindromeNumber(num));
        System.out.println (reverseString ("axxabcxdxxderx"));
    }

}

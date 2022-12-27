package in.co.decimal.service;

import java.util.Scanner;

public class ST {
    public static int wayToReachTopOfStair(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int opt1 = wayToReachTopOfStair (n-1);
        int opt2 = wayToReachTopOfStair (n-2);
        int opt3 = wayToReachTopOfStair (n-3);
        return opt1 + opt2 + opt3;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();
        int result = wayToReachTopOfStair(n);
        System.out.println (result);
    }
}

package in.co.decimal.service;



import java.util.Random;
import java.util.Scanner;

public class GenrateRandomNo {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();
        int result = nDigitRandomNo(n);
        System.out.println (result);

    }

    private static int nDigitRandomNo(int n) {
        int pow = (int)Math.pow (10, n-1);
        int genratedValue = new Random ().nextInt (9 * pow);
        return genratedValue;
    }
}

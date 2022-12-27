package in.co.decimal.service;

import java.util.Scanner;

public class printFactorialN {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}

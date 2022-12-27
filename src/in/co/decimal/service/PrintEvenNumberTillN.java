package in.co.decimal.service;

import java.util.Scanner;

public class PrintEvenNumberTillN {
    public static void printEvenNo(int n){
        for(int i=2; i<=n; i+=2){
            System.out.print (i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        printEvenNo(n);
    }
}

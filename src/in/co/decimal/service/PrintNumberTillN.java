package in.co.decimal.service;

import java.util.Scanner;

public class PrintNumberTillN {
    public static void printNumber(int n){
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        printNumber(n);
    }
}

package in.co.decimal.service;

import java.util.Scanner;

public class PrintAllOddNumberTillN {
    public static void printOddNumber(int n){
        for(int i=1; i<=n; i+=2){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        printOddNumber(n);
    }
}

package in.co.decimal.service;

import java.util.Scanner;

import static in.co.decimal.service.CheckPrime.isPrime;

public class PrintPrimeNumberN {
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=2; i<=n; i++){
            boolean result = isPrime(i);
            if(result){
                System.out.print(i+" ");
            }
        }
    }
}

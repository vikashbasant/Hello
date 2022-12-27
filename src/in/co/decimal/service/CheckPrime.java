package in.co.decimal.service;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int number){
        boolean flag = true;
        for(int i=2; i<number; i++){
            if(number%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isPrimeBetter(int n){
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMoreBetter(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean result = isPrimeMoreBetter(number);
        if (result) {
            System.out.println ("Number is Prime");
        }else{
            System.out.println ("Number is not Prime");
        }
    }
}

package in.co.decimal.service;

import java.util.Scanner;

public class Sum1ToN {
    public static int sumN(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = sumN(n);
        System.out.println (result);
    }
}

package in.co.decimal.service;

import java.util.Scanner;

public class ArrayEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) {
            {
                arr2[i] = scan.nextInt ();
            }
        }

        if (arr1 == arr2) {
            System.out.println ("true");
        }

        if (arr1.equals (arr2)) {
            System.out.println ("true");
        }
    }
}

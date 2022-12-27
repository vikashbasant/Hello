package in.co.decimal.service;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = scan.nextInt();
            arr[i] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print (arr[i][j]+" ");
            }
            System.out.println ();
        }
    }
}

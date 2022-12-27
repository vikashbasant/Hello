package in.co.decimal.service;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
    public static void printArrayIntersection(int arr1[], int arr2[]){
        Arrays.sort (arr1);
        Arrays.sort (arr2);

        int i=0, j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.println (arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();
        int arr1[] = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int arr2[] = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = scan.nextInt();
        }

        printArrayIntersection(arr1, arr2);
    }
}

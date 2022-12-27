package in.co.decimal.service;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vikash Basant
 * TimeComplexity: O(nlogn + mlogn)
 * SpaceComplexity: O(1)
 */
public class OptimalArrayIntersection {

    public static void binarySearch(int a[], int element){
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(a[mid] == element){
                System.out.println (element);
                return;
            }else if(a[mid] > element){
                j = mid -1;
            }else{
                i++;
            }

        }
    }
    public static void printArrayInterSectionHelper(int a[], int b[]){
        for(int i=0; i<b.length; i++){
            int element = b[i];
            binarySearch(a, element);
        }
    }
    public static void printArrayInterSection(int a[], int b[]){
        if(a.length < b.length){
            Arrays.sort(a);
            printArrayInterSectionHelper (a, b);
        }else{
            Arrays.sort(b);
            printArrayInterSectionHelper (b, a);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();

        int arr1[] = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = scan.nextInt ();
        }

        int m = scan.nextInt();
        int arr2[] = new int[m];

        for(int i=0; i<m; i++){
            arr2[i] = scan.nextInt ();
        }

        printArrayInterSection(arr1, arr2);
    }
}

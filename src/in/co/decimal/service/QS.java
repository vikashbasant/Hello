package in.co.decimal.service;

import java.util.Scanner;

public class QS {
    public static void swap(int[] arr, int n, int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    public static int partition(int arr[], int si, int ei){
        int pivotElement = arr[si];
        int correctPositionOfPivotElement = 0;
        for(int i=si; i<=ei; i++){
            if(pivotElement>arr[i]){
                correctPositionOfPivotElement++;
            }
        }

        int pivotElementIndex = si+correctPositionOfPivotElement;
        swap(arr, si, pivotElementIndex);

        int i = si;
        int j = ei;
        while(i<j){
            if(arr[i] < pivotElement){
                i++;
            }else if(arr[j] >= pivotElement){
                j--;
            }else{
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotElementIndex;
    }
    public static void quickSort(int arr[], int si, int ei){
        // Base Case: If the array has only one element
        if(si>=ei){
            return;
        }
        // Induction Hypothesis: If the array has more than one element
        int partitionIndex = partition(arr, si, ei);
        // Induction Step: Recursively sort the left and right sub-arrays
        quickSort(arr, si, partitionIndex-1);
        quickSort(arr, partitionIndex+1, ei);
    }
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();

        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt ();
        }

        quickSort(arr);

        for(int ele:arr){
            System.out.print (ele+" ");
        }
    }
}

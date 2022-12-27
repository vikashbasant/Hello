package in.co.decimal.service;

import java.util.Scanner;

public class QuickSort {
    public static void swap(int arr[], int n, int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[si];
        int count = 0;
        for(int i=si; i<=ei; i++){
            if(arr[i] < pivot){
                count++;
            }
        }

        int pivotPosition = si+count;
        swap(arr, si, pivotPosition);

        int i = si, j = ei;
        while(i<j){
            if(arr[i] < pivot){
                i++;
            }else if(arr[j] >= pivot){
                j--;
            }else{
                swap(arr, i, j);
                i++;
                j--;
            }

        }

        return pivotPosition;

    }
    public static void quickSort(int arr[], int si, int ei){
        // Base Case:
        if(si >= ei){
            return;
        }
        // Induction Hypothesis:
        int pivotIndex = partition(arr, si, ei);
        // Induction Step:
        quickSort (arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);
    }
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        quickSort(arr);

        for(int ele:arr){
            System.out.print (ele+" ");
        }
    }
}

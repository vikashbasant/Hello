package in.co.decimal.service;

import java.util.Scanner;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean flag = true;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    flag = false;
                    swap(arr, j, j+1);
                }
            }
            if(flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt ();
        }

        bubbleSort(arr);

        for(int ele:arr){
            System.out.print (ele+" ");
        }
    }
}

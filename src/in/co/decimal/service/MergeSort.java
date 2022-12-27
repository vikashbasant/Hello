package in.co.decimal.service;

import java.util.Scanner;

public class MergeSort {
    public static void merge(int dest[], int s1[], int s2[]){
        int i=0, j=0, k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<s2[j]){
                dest[k++] = s1[i++];
            }else{
                dest[k++] = s2[j++];
            }
        }

        while(i<s1.length){
            dest[k++]=s1[i++];
        }
        while(j<s2.length){
            dest[k++] = s2[j++];
        }
    }
    public static void mergeSort(int []arr){
        // Base Case:
        if(arr.length <= 1){
            return;
        }

        int midIndex = (arr.length/2);

        int leftArray[] = new int[midIndex];
        for(int i=0; i<midIndex; i++){
            leftArray[i] = arr[i];
        }

        int rightArray[] = new int[arr.length-midIndex];
        for(int i=midIndex; i<arr.length; i++){
            rightArray[i-midIndex] = arr[i];
        }

        // Induction Hypothesis:
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(arr, leftArray, rightArray);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt ();
        }

        mergeSort(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

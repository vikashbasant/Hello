package in.co.decimal.service;

import java.util.Scanner;

public class MM {
    public static void merge(int[] destination, int[] source1, int[] source2){
        int i=0;
        int j=0;
        int k=0;
        while(i<source1.length && j<source2.length){
            if(source1[i]<source2[j]){
                destination[k] = source1[i];
                i++;
                k++;
            }else{
                destination[k] = source2[j];
                j++;
                k++;
            }
        }
        while(i<source1.length){
            destination[k] = source1[i];
            i++;
            k++;
        }
        while(j<source2.length){
            destination[k] = source2[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr){
        // Base Case: If the array has only one element
        if(arr.length <= 1){
            return;
        }
        // Find Mid Index:
        int mid = arr.length/2;

        // Create two arrays to store the left and right halves of the array
        int left[] = new int[mid];
        for(int i=0; i<left.length; i++){
            // copy the element from the original array to the left array
            left[i] = arr[i];
        }
        int right[] = new int[arr.length-mid];
        for(int i=0; i<right.length; i++){
            // copy the element from the original array to the right array
            right[i] = arr[mid+i];
        }
        // Induction Hypothesis:
        mergeSort (left);
        mergeSort (right);

        // Induction Step:
        merge(arr, left, right);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt ();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt ();
        }

        mergeSort(arr);
        for(int ele: arr){
            System.out.print (ele+" ");
        }
    }
}

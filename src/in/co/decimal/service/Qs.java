package in.co.decimal.service;
import java.util.Scanner;
public class Qs
{
    public static void swap(int arr[], int n, int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    public static int partition(int arr[], int si, int ei){
        // find pivot ele:
        int pivot = arr[si];

        int count = 0;
        for(int i=si; i<=ei; i++){
            if(pivot > arr[i]){
                count++;
            }
        }

        // put pivot to the actual position:
        swap(arr, si, si+count);
        int pivotIndex = si+count;

        // put all smaller element left side:
        // put all bigger element right side:

        int i = si;
        int j = ei;
        while(i<pivotIndex && j>pivotIndex){
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

        // return pivotIndex:
        return pivotIndex;


    }
    public static void quickSort(int arr[], int si, int ei){
        // Base Case:
        if(si >= ei){
            return;
        }

        int partitionIndex = partition(arr, si, ei);

        quickSort(arr, si, partitionIndex-1);
        quickSort(arr, partitionIndex+1, ei);
    }
    public static void quickSort(int arr[]){
        quickSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        quickSort(arr);

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}


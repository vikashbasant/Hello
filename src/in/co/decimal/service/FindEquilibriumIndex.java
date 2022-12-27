package in.co.decimal.service;

import java.util.Scanner;

public class FindEquilibriumIndex {

    public static int optimalEquilibriumIndex(int arr[]){
        // Find the total sum:
        int totalSum = 0, ans = -1;
        for(int ele: arr){
            totalSum+=ele;
        }
        int leftSum = 0;

        for(int i=0; i<arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                ans = i;
                break;
            }else{
                leftSum+=arr[i];
            }

        }
        return ans;
    }
    public static int equilibriumIndex(int arr[]){
        int eIndex = -1;
        for(int i=0; i<arr.length; i++){
            int leftSum = 0;
            for(int j=0; j<i; j++){
                leftSum+=arr[j];
            }
            int rightSum = 0;
            for(int k=i+1; k<arr.length; k++){
                rightSum+=arr[k];
            }

            if(leftSum == rightSum){
                eIndex = i;
                break;
            }
        }
        return eIndex;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt ();
        }

        int result = optimalEquilibriumIndex(arr);
        System.out.println (result);
    }
}

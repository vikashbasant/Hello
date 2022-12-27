package in.co.decimal.service;

import java.util.Arrays;

public class Sum {
    public int sumOfArray(int[] arr){
        int sum = 0;
        for(int ele: arr){
            sum+=ele;
        }
        return sum;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j=j+2){
                int[] internalResult = Arrays.copyOfRange(arr, i, j+1);
                totalSum += sumOfArray(internalResult);;
            }
        }
        return totalSum;

    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3};
        System.out.println (new Sum().sumOddLengthSubarrays(arr));
    }
}

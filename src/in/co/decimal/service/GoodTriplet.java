package in.co.decimal.service;

import java.util.Scanner;

public class GoodTriplet {

    public static boolean checkTriplet(int iEle, int jEle, int kEle, int a, int b, int c){
        if(Math.abs(iEle-jEle) <= a && Math.abs(jEle-kEle) <= b && Math.abs(iEle - kEle) <= c ){
            return true;
        }
        return false;
    }
    public static int findGoodTriplet(int arr[], int a, int b, int c){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    System.out.println ("("+arr[i]+ ","+arr[j] + ","+arr[k]+")");
                    if(checkTriplet(arr[i], arr[j], arr[k], a, b, c)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int arr[] = {1,1,2,2,3};
        int a = 0, b =0, c=1;
        int result = findGoodTriplet(arr, a, b, c);
        System.out.println (result);
    }
}

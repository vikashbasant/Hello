package in.co.decimal.service;

import java.util.Scanner;

public class LowestPairDifference {
    public static int pairDifference(int[] arr){
        int hMax, sMax;
        hMax = sMax = Integer.MIN_VALUE;
        int sMin, hMin;
        sMin = hMin = Integer.MAX_VALUE;

        for(int ele: arr){
            if(hMax <= ele){
                sMax = hMax;
                hMax = ele;
            }else if(sMax < ele){
                sMax = ele;
            }

            if(sMin>=ele){
                hMin = sMin;
                sMin = ele;
            }else if(hMin > ele){
                hMin = ele;
            }
        }
        System.out.println (hMax +" "+ sMax +" "+sMin+" "+hMin);
        return ((hMax*sMax)-(sMin*hMin));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int result = pairDifference(arr);
        System.out.println (result);
    }
}

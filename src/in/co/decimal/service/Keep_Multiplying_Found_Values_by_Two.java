package in.co.decimal.service;

import java.util.*;

public class Keep_Multiplying_Found_Values_by_Two {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<> ();
        for(int ele: nums){
            if(ele>=original){
                set.add(ele);
            }
        }
        while(true){
            if(set.contains(original)){
                original*=2;

            }else{
                break;
            }
        }
        return original;
    }
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int original = scan.nextInt();
        Keep_Multiplying_Found_Values_by_Two obj = new Keep_Multiplying_Found_Values_by_Two ();
        int finalValue = obj.findFinalValue (arr, original);
        System.out.println (finalValue);


    }
}

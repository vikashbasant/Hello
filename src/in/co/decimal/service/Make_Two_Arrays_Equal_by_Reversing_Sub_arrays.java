package in.co.decimal.service;

import java.util.Arrays;
import java.util.HashMap;

public class Make_Two_Arrays_Equal_by_Reversing_Sub_arrays {

    public static void reverseArray(int[] arr, int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }

    public static int findIndex(int[] arr, int ele){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }

    // TimeComplexity: O(n)
    // SpaceComplexity: O(n)
    public static boolean canBeEqual(int[] target, int[] arr) {
        for(int i=0; i<target.length; i++){
            int lastIndex = findIndex(arr, target[i]);
            if(lastIndex == -1){
                return false;
            }else if(i != lastIndex){
                reverseArray(arr, i, lastIndex);
            }
        }
        return Arrays.equals (target, arr);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean canBeEqualBetter(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        int n = arr.length;
        int m = target.length;
        if(n != m){
            return false;
        }
        for(int i=0; i<m; i++){
            map.put(target[i], map.getOrDefault (target[i], 0)+1);
            map.put(arr[i], map.getOrDefault (arr[i], 0)-1);
        }

        for(int i: map.values ()){
            if(i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] target = {1,2,3};
        int[] arr = {3,2,1};
        boolean ans = canBeEqualBetter(target, arr);
        System.out.println (ans);
    }
}

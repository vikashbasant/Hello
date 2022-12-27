package in.co.decimal.service;

import java.util.*;

public class NumberOfRectangleThatFormTheLargestSquare {
    public static int largestSquare(int[][] arr){
        Map<Integer,Integer> mp = new HashMap<> ();
        for(int[] ele: arr){
            int[] internal = ele;
            int max = Integer.MAX_VALUE;
            for(int side: internal){
                max = Math.min(max, side);
            }

            if(mp.containsKey (max)){
                mp.put(max, mp.get(max)+1);
            }else{
                mp.put(max, 1);
            }
        }
        int value = Integer.MIN_VALUE;
        for(int val : mp.keySet ()){
            value = Math.max(value, val);
        }
        return mp.get(value);
    }

    public static int largestSquareBetter(int[][] arrs){
        Map<Integer, Integer> map = new HashMap<> ();
        for(int[] arr : arrs){
            int key = Math.min(arr[0], arr[1]);
            map.put(key,map.getOrDefault (key, 0)+1);
        }

        ArrayList<Integer> result = new ArrayList<> (map.keySet ());
        return map.get(Collections.max (result));
    }

    public static int largestSquareBetterBetter(int rectangles[][]){
        int cnt = 0, mx = 0;
        for (int[] rec : rectangles) {
            int side = Math.min(rec[0], rec[1]);
            if (side > mx) {
                cnt = 1;
                mx = side;
            }else if (side == mx) {
                ++cnt;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int arr[][] = {{2,3},{3,7},{4,3},{3,7}};
        int result = largestSquareBetterBetter(arr);
        System.out.println (result);
    }
}

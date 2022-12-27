package in.co.decimal.service;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static int sumOfUnique(int[] arr){
        Map<Integer, Integer> map = new HashMap<> ();
        int res = 0;
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
            if(map.get(ele) == 1){
                res += ele;
            }else if(map.get(ele) == 2){
                res -= ele;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,2};
        int result = sumOfUnique(arr);
        System.out.println (result);
    }
}

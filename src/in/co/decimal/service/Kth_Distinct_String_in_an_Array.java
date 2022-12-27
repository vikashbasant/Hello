package in.co.decimal.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class Kth_Distinct_String_in_an_Array {
    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<> ();
        for(String ele: arr){
            map.put(ele, map.getOrDefault (ele, 0)+1);
        }
        int temp = 0;
        for(String ele: arr){
            if(map.get (ele) == 1 && (++temp == k)){
                return ele;
            }


        }
        return "";
    }

    public static void main(String[] args){
        String[]  arr = {"d","b","c","b","c","a"};
        int k = 2;
        String ans = kthDistinct (arr, k);
        System.out.println (ans);

    }
}

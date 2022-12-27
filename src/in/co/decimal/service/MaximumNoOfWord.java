package in.co.decimal.service;


import java.util.HashMap;
import java.util.Map;

public class MaximumNoOfWord {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        Map<Integer, Integer> map = new HashMap<> ();
        int goodPair = 0;
        for(int ele: arr){
            if(map.containsKey (ele)){
                int count = map.get(ele);
                goodPair+=count;
                map.put(ele, count+1);
            }else{
                map.put(ele, 1);
            }
        }
        System.out.println (goodPair);
    }
}

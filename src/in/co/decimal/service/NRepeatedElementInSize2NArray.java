package in.co.decimal.service;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public static int repeatedNTimes(int[] nums) {
        int[] count = new int[10000];
        for (int a : nums)
            if (count[a]++ == 1)
                return a;
        return -1;

    }
    public static int repeatedNTimesHashMap(int[] nums){
        Map<Integer, Integer> hashM = new HashMap<> ();
        for(int ele: nums){
            int freq = hashM.getOrDefault(ele, 0);
            if(freq == 1){
                return ele;
            }
            hashM.put(ele, freq+1);
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {2,1,2,5,3,2};
        int result = repeatedNTimesHashMap(nums);
        System.out.println (result);
    }


}

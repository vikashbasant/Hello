package in.co.decimal.service;

import java.util.HashMap;

public class Test2 {
    public static int minMovesToSeat(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]-k)){
                count+=map.get(nums[i]-k);
            }
            if(map.containsKey(nums[i]+k)) {
                count+=map.get (nums[i]+k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int[] seats = {1,2,2,1};
        int k = 1;
        int result = minMovesToSeat(seats, k);
        System.out.println (result);
    }
}

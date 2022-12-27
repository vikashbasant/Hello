package in.co.decimal.service;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static List<Integer> findTargetIndices(int[] arr, int target){
        int count = 0, lessthan = 0;
        for(int ele: arr){
            if(ele == target) {
                count++;
            }else if(ele < target){
                lessthan++;
            }
        }
        List<Integer> result = new ArrayList<> ();
        for(int i=0; i<count; i++){
            result.add(lessthan++);
        }
        return result;
    }
    public static void main(String[] agrs){
        int[] nums = {1,6,2,3,2,4,2,6,2,7,8};
        int target = 6;
        List<Integer> result = findTargetIndices(nums, target);
        for(int i: result){
            System.out.println (i);
        }
    }
}

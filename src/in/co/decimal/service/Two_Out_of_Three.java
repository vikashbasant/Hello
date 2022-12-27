package in.co.decimal.service;

import java.util.*;

public class Two_Out_of_Three {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<> ();

        for(int ele: nums1){
            set1.add(ele);
        }
        Set<Integer> set2 = new HashSet<> ();

        for(int ele: nums2){
            set2.add(ele);
        }
        Set<Integer> set3 = new HashSet<> ();

        for(int ele: nums3){
            set3.add(ele);
        }
        List<Integer> list = new ArrayList<> ();
        Map<Integer, Integer> map = new HashMap<> ();

        for(int ele: set1){
            map.put(ele, 0);
        }

        for(int ele: set2){
            int aNull = map.getOrDefault (ele, -1);
                map.put(ele, aNull+1);
        }

        for(int ele: set3){
            int aNull = map.getOrDefault (ele, -1);

                map.put(ele, aNull+1);


        }

        for(Map.Entry<Integer,Integer> mapElement : map.entrySet()){
            if(mapElement.getValue()!=0){
                list.add(mapElement.getKey() );
            }
        }

        return list;

    }

    public List<Integer> twoOutOfThreeBetter(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: nums1){
            int freq = map.getOrDefault(ele, 0);
            if(freq == 0){
                map.put(ele, 1);
            }
        }

        for(int ele: nums2){
            int freq = map.getOrDefault (ele, 0);
            if(freq == 0){
                map.put (ele,2);
            }else if(freq == 1){
                ans.add(ele);
                map.put(ele, -1);
            }
        }

        for(int ele: nums3){
            int freq = map.getOrDefault (ele, 0);
            if(freq == 1 || freq == 2){
                ans.add(ele);
                map.put(ele, -1);
            }
        }
        return ans;

    }
    public static void main(String[] agrs){
        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};
        Two_Out_of_Three obj = new Two_Out_of_Three ();
        List<Integer> integers = obj.twoOutOfThreeBetter (nums1, nums2, nums3);
        for(int ele: integers){
            System.out.print (ele+" ");
        }

    }
}

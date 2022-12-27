package in.co.decimal.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();

        ArrayList<Integer> internal = new ArrayList<>();
        internal.add (1);
        internal.add(2);
        aList.add(internal);


        ArrayList<Integer> internal1 = new ArrayList<>();
        internal1.add (2);
        internal1.add(3);
        aList.add(internal1);


        ArrayList<Integer> internal2 = new ArrayList<>();
        internal2.add (2);
        internal2.add(1);
        aList.add(internal2);

        ArrayList<Integer> o = xorOp (aList);
        System.out.println (o.get(0));

    }

    private static ArrayList<Integer> xorOp(ArrayList<ArrayList<Integer>> aList) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(ArrayList<Integer> ele: aList){
            if(ele.get(0) == 1){
                arr.add(ele.get(1));
            }else{
                int i = ele.get (1);
                for(Integer temp : arr){
                    i = temp ^ i;
                }
                arr.clear ();
                arr.add(i);
            }
        }
        return arr;
    }


}

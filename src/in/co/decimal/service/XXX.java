package in.co.decimal.service;

import java.util.ArrayList;
import java.util.List;

public class XXX {

    private boolean isNumberDivisbleByEveryDigit(int num){
        String strNum  = ""+num;
        for(int i=0; i<strNum.length(); i++){
            int temp = strNum.charAt(i)-'0';

            if( temp == 0 || num%temp != 0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<Integer> ();
        for(int i=left; i<=right; i++){
            if(isNumberDivisbleByEveryDigit(i) == true){
                arr.add(i);
            }
        }

        return arr;
    }

    public static void main(String args[]){
        XXX obj = new XXX();
        List<Integer> integers = obj.selfDividingNumbers (47, 85);
        System.out.println (integers);
    }
}

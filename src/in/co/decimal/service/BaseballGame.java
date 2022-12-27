package in.co.decimal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> arr = new ArrayList<> ();
        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("C")){
                sum -= arr.get (arr.size()-1);
                arr.remove (arr.size()-1);

            }else if(ops[i].equals("D")){
                sum+=arr.get (arr.size()-1)*2;
                arr.add(arr.get(arr.size()-1)*2);


            }else if(ops[i].equals("+")){
                sum+=arr.get(arr.size()-1)+arr.get(arr.size()-2);
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));

            }else{
                arr.add(Integer.parseInt(ops[i]));
                sum+=Integer.parseInt(ops[i]);
            }

        }

        return sum;
    }
    public static void main(String[] agrs){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next ();
        }
        System.out.println (calPoints (str));
    }
}

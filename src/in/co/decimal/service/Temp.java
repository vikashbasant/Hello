package in.co.decimal.service;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Temp {



    private static boolean isStringAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }


        char arr[] = str1.toLowerCase ().toCharArray ();
        char arr1[] = str2.toLowerCase ().toCharArray ();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr, arr1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String str1 = scan.nextLine ();
        scan.nextLine();
        String str2 = scan.nextLine ();

        boolean result = isStringAnagram(str1, str2);
        System.out.println (result);

    }
}

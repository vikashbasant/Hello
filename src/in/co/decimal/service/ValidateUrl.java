package in.co.decimal.service;

import java.net.URL;
import java.util.Scanner;

public class ValidateUrl {
    public static boolean validateUrl(String str) {
        try{
            new URL (str).toURI();
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean result = validateUrl(str);
        System.out.println (result);


    }

}


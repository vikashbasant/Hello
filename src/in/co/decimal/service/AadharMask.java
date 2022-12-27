package in.co.decimal.service;

import java.util.Scanner;

public class AadharMask {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        String otp = "923532777583Vikash";
        String aadhar = "923532777583";

        String replace = otp.replace (aadhar, aadhar.substring (8));
        System.out.println (replace);


    }
}

package in.co.decimal.service;

import java.util.Scanner;

public class ValidTriangle {
    public static boolean isValid(int sideA, int sideB, int sideC){
        if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA) {
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int sideC = scan.nextInt();

        boolean result = isValid (sideA, sideB, sideC);
        if(result){
            System.out.println ("The Triangle is Valid");
        }else{
            System.out.println ("The Triangle is not Valid");
        }
    }
}

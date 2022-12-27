package in.co.decimal.service;

import java.util.Scanner;

public class PrintTable {
    public static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        table(n);

        System.out.println ("Size of byte is: "+Byte.SIZE+" bits & "+ Byte.SIZE/8+" bytes");
        System.out.println ("Size of integer is: "+Integer.SIZE+" bits & " + Integer.SIZE/8+" bytes");
        System.out.println ("Size of double is: "+Double.SIZE+" bits & " + Double.SIZE/8+" bytes");
        System.out.println ("Size of float is: "+Float.SIZE+" bits & " + Float.SIZE/8+" bytes");
        System.out.println ("Size of character is: "+Character.SIZE+" bits & " + Character.SIZE/8+" bytes");
        System.out.println ("Size of long is: "+Long.SIZE+" bits & " + Long.SIZE/8+" bytes");
        System.out.println ("Size of short is: "+Short.SIZE+" bits & "+ Short.SIZE/8+" bytes");



    }
}

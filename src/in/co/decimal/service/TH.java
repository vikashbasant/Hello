package in.co.decimal.service;

import java.util.Scanner;

import static in.co.decimal.service.TowerHonai.towerHonai;

public class TH {
    public static void towerHonai(int n, char s, char h, char d){
        if(n == 1){
            System.out.println ("Move " + n +"st from " + s + " to " + d);
            return;
        }

        towerHonai(n-1, s, d, h);
        System.out.println ("Move " + n +"th from " + s + " to " + d);
        towerHonai(n-1, h, s, d);
    }
    public static void towerHonai(int n){
        towerHonai(n, 'A', 'B', 'C');
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        towerHonai(n);
    }
}

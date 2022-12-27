package in.co.decimal.service;

import java.util.Scanner;

public class TowerHonai {
    public static void towerHonai(int n, char s, char h, char d){
        if(n == 1){
            System.out.println ("move "+ n +"st disk from " + s + " to " + d);
            return;
        }
        towerHonai(n-1, s, d, h);
        System.out.println ("move "+ n +"th disk from " + s + " to " + d);
        towerHonai(n-1, h, s, d);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt ();
        towerHonai(n, 'S', 'H', 'D');
    }
}

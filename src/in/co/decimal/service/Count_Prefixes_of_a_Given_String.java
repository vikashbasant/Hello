package in.co.decimal.service;

import java.util.Scanner;

public class Count_Prefixes_of_a_Given_String {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String word: words){
            count+=s.startsWith (word)? 1:0;
        }
        return count;
    }
    public static void main(String[] agrs){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next ();
        }
        String words = scan.next();
        Count_Prefixes_of_a_Given_String obj = new Count_Prefixes_of_a_Given_String ();
        int i = obj.countPrefixes (str, words);
        System.out.println (i);


    }
}

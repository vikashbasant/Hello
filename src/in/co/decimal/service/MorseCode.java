package in.co.decimal.service;


import java.util.HashSet;

public class MorseCode {
    static final String ARR[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set=new HashSet ();
        for(String word: words){
            String str = "";
            for(int i=0; i<word.length(); i++){
                int index = (word.charAt(i)-'a');
                str+=ARR[index];
            }
            set.add(str);
        }
        return set.size();
    }

    public static void main(String []args){
        String[] words = {"a"};
        int result = uniqueMorseRepresentations (words);
        System.out.println (result);
    }
}



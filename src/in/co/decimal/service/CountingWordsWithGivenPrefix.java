package in.co.decimal.service;

import java.util.stream.Stream;

public class CountingWordsWithGivenPrefix {
    public static int countWordsWithPrefix(String[] words, String prefix) {
        int count = 0;
        for(String word: words){
            if(word.startsWith(prefix)){
                count++;
            }
        }
        return count;
    }

    public static int countWordsWithPrefixOwn(String[] words, String prefix){
        int count = 0;
        int len = prefix.length();
        for(String word: words){
            if(word.length() >= len && word.equals (word.substring (0,len))){
                count++;
            }
        }
        return count;
    }

    public static int countWordsWithPrefixFunctional(String[] words, String prefix){
        int count = (int)Stream.of (words).filter (w -> w.startsWith (prefix)).count ();
        return count;
    }

    public static void main(String[] args){
        String[] words = {"pay","attention","practice","attend"};
        String prefix = "att";
        int result = countWordsWithPrefix(words, prefix);
        System.out.println (result);
    }
}

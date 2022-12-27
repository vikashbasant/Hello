package in.co.decimal.service;

public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words){
        boolean alpha[] = new boolean[26];
        for(char ch: allowed.toCharArray()){
            alpha[ch-'a'] = true;
        }

        int count = 0;
        search:
        for(String word: words){
            for(char ch: word.toCharArray ()){
                if(!alpha[ch-'a']){
                    continue search;
                }
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int result = countConsistentStrings(allowed, words);
        System.out.println (result);
    }
}

package in.co.decimal.service;

public class CountWord {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word: words){
            boolean flag = true;
            for(int i=0;i<allowed.length(); i++){
                String ch = Character.toString(allowed.charAt(i));
                if(!word.contains(ch)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int result = countConsistentStrings(allowed, words);
        System.out.println (result);
    }
}

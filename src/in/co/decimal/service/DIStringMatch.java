package in.co.decimal.service;

public class DIStringMatch {
    public static int[] diStringMatch(String s){
        int n = s.length();
        int[] result = new int[n+1];
        int high = n, low = 0;
        for(int i=0; i<n; i++){
            result[i] = s.charAt (i) == 'I' ? low++ : high--;
        }
        result[n] = high;
        return result;
    }
    public static void main(String[] args){
        String S = "III";
        int[] result = diStringMatch(S);
        for(int i: result){
            System.out.print (i+" ");
        }
    }
}

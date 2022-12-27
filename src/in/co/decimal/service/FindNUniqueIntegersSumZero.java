package in.co.decimal.service;

public class FindNUniqueIntegersSumZero {
    public static int[] uniqueInteger(int n){
        int[] result  = new int[n];
        for(int i=0; i<n; i++){
            result[i] = (i*2)-n+1;
        }
        return result;
    }

    public static int[] uniqueIntegerBetter(int n){
        int temp = n;
        int[] result = new int[n];
        for(int i=0; i<n/2; i++){
            result[i] = temp;
            result[n-1-i] = -temp;
            temp--;
        }
        return result;
    }
    public static void main(String[] args){
        int n = 7;
        int[] result = uniqueIntegerBetter(n);
        for(int i: result){
            System.out.print (i+" ");
        }
    }
}

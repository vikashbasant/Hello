package in.co.decimal.service;

public class CountEqualDivisiblePairs {
    public static int countEqual(int[] arr, int k){
        int n = arr.length;
        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    if((i*j)%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,2,2,1,3};
        int k = 2;
        int result = countEqual(arr, k);
        System.out.println (result);
    }
}

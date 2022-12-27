package in.co.decimal.service;

public class SumofAllSubsetXORTotals {
    public static void main(String[] args) {
        int arr[] = {2,5,6};
        int result = sumAllSubset(arr);
        System.out.println (result);
    }

    private static int allSubset(int[] arr, int index, int output){
        if(index==arr.length){
            return output;
        }

        int smallerResult = allSubset (arr, index+1, output^arr[index]);
        int smallerResult1 = allSubset (arr, index+1, output);

        return smallerResult+smallerResult1;
    }
    public static int sumAllSubset(int[] arr) {
        int result = allSubset(arr, 0, 0);
        return result;

    }
}

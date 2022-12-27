package in.co.decimal.service;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static int[] replaceGreatestRightElement(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n];
        newArr[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            newArr[i] = Math.max(arr[i], newArr[i+1]);
        }
        newArr[n-1] = -1;
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {400};
        int result[] = replaceGreatestRightElement(arr);
        for(int ele: result){
            System.out.print (ele+" ");
        }
    }
}

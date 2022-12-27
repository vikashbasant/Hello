package in.co.decimal.service;

import java.util.Scanner;

public class TableMagic {

    public static void merge(int[] dest, int[] source1, int[] source2){
        int i=0, j=0, k=0;
        while(i<source1.length && j<source2.length){
            if(source1[i] < source2[j]) {
                dest[k] = source2[j];
                k++;
                j++;
            }else{
                dest[k] = source1[i];
                k++;
                i++;
            }
        }
        while(i<source1.length){
            dest[k] = source1[i];
            k++;
            i++;
        }

        while(j<source2.length){
            dest[k] = source2[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int[] arr){
        // Base Case:
        if(arr.length <= 1){
            return;
        }

        int midIndex = arr.length/2;
        int[] leftSubArray = new int[midIndex];
        for(int i=0; i<midIndex; i++){
            leftSubArray[i] = arr[i];
        }

        int[] rightSubArray = new int[arr.length-midIndex];
        for(int i=midIndex; i<arr.length; i++){
            rightSubArray[i-midIndex] = arr[i];
        }

        mergeSort(leftSubArray);
        mergeSort(rightSubArray);
        merge(arr, leftSubArray, rightSubArray);

    }



    public static void starPattern(int num){
        for(int i=1; i<=num; i++){
            // for space:
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            // for increasing:
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }

            // for decreasing:
            for(int l=i-1; l>=1; l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static boolean magicNo(int num){
        int iternalNum = num;
        while(iternalNum>9){
            int sum = 0;
            while(iternalNum>0){
                sum+=iternalNum%10;
                iternalNum/=10;
            }
            iternalNum = sum;
        }
        if(iternalNum == 1){
            return true;
        }else{
            return false;
        }
    }

    public static void palindrome(int num){
        int temp = num;
        int totalSum = 0;
        while(temp>0){
            int digit = temp%10;
            totalSum = totalSum*10 + digit;
            temp/=10;

        }
        if(totalSum == num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static void armstrong(int num){
        int temp1=num, temp2 = num;
        int total = 0;
        int len = 0;
        while(temp1>0){
            len++;
            temp1/=10;
        }

        while(temp2>0){
            total+=Math.pow(temp2%10, len);
            temp2/=10;
        }
        if(total == num) {
            System.out.println ("Armstrong");
        }else{
            System.out.println ("Not Armstrong");
        }
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
//        System.out.println ("Enter the size of array: ");
//        int size = scan.nextInt();
//        int[] arr = new int[size];
//        for(int i=0; i<size; i++){
//            arr[i] = scan.nextInt();
//        }
//
//        mergeSort(arr);
//        for(int ele: arr){
//            System.out.print (ele+" ");
//        }
//        int num = 12345;
//        if(magicNo (num)){
//            System.out.println ("Yes This number is "+num +" Magic Number");
//        }else{
//            System.out.println ("No This number is not a "+num +" Magic Number");
//        }

//        palindrome (141);
        armstrong(121);


    }
}

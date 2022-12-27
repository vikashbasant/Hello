package in.co.decimal.service;

import java.util.Arrays;

public class Maximum_Units_on_a_Truck {
    // TimeComplexity: O(nlogn)
    // SpaceComplexity: O(1)
    public static int maximumUnitsOnATruck(int[][] boxTypes, int truckSize){
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int maximumUnitOfBoxes = 0;
        for(int[] box: boxTypes){
            int noOfBoxs = box[0];
            int noOfUnits = box[1];
            if(truckSize > noOfBoxs){
                maximumUnitOfBoxes += (noOfBoxs*noOfUnits);
                truckSize -= noOfBoxs;
            }else{
                maximumUnitOfBoxes += (truckSize*noOfUnits);
                return maximumUnitOfBoxes;
            }
        }
        return maximumUnitOfBoxes;
    }
    //========================// Another Approach //=======================//
    // TimeComplexity: O(nlogn)
    // SpaceComplexity: O(1)
    public static int maximumUnits(int[][] boxTypes, int truckSize){
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int maximumUnitOfBoxes = 0;
        int i = 0;
        while(truckSize>0 && i<boxTypes[0].length){
            int noOfBoxs = boxTypes[i][0];
            int noOfUnits = boxTypes[i][1];
            if(noOfBoxs <= truckSize){
                maximumUnitOfBoxes += (noOfBoxs*noOfUnits);
                truckSize -= noOfBoxs;
            }else{
                maximumUnitOfBoxes += (truckSize*noOfUnits);
                truckSize -=noOfBoxs;
            }
            i++;
        }
        return maximumUnitOfBoxes;
    }
    public static void main(String[] args){
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        int result = maximumUnits(boxTypes, truckSize);
        System.out.println (result);

    }
}

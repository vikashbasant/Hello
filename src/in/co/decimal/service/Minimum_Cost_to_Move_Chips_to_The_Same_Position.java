package in.co.decimal.service;

public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public int minCostToMoveChips(int[] position) {
        int oCount = 0, eCount = 0;
        for(int ele: position){
            if(ele%2==0){
                eCount++;
            }else{
                oCount++;
            }
        }
        return Math.min(eCount, oCount);
    }

    public static void main(String[] args){
        int[] position = {1,2,3};
        Minimum_Cost_to_Move_Chips_to_The_Same_Position obj = new Minimum_Cost_to_Move_Chips_to_The_Same_Position ();
        int result = obj.minCostToMoveChips (position);
        System.out.println (result);

    }
}

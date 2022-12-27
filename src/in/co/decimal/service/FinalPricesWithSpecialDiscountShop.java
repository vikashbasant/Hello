package in.co.decimal.service;

import java.util.Stack;

public class FinalPricesWithSpecialDiscountShop {
    // TimeComplexity: O(N^2)
    // SpaceComplexity: O(N)
    public static int[] finalPrices(int[] prices) {
        int discountPrice[] = new int[prices.length];
        int i;
        for(i=0; i<prices.length-1; i++){
            boolean flag = false;
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]>=prices[j]){
                    discountPrice[i] = prices[i]-prices[j];
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                discountPrice[i] = prices[i];
            }

        }
        discountPrice[i] = prices[i];
        return discountPrice;
    }

    // TimeComplexity: O(N)
    // SpaceComplexity: O(1)
    public static int[] finalPricesUsingStack(int[] prices){
        Stack<Integer> stack = new Stack();
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty () && prices[stack.peek()] >= prices[i]){
                prices[stack.pop()]-=prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
    public static void main(String[] args){
        int prices[] = {10,1,1,6};
        int[] result = finalPricesUsingStack(prices);
        for(int ele: result){
            System.out.print (ele+" ");
        }

    }

}

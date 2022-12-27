package in.co.decimal.service;

import java.util.Arrays;

public class TheKWeakestRowsinaMatrix {
    private static int[] count1Add(int[][] mat){
        int[] cont1s = new int[mat.length];
        for(int i=0; i<mat.length;i++){
            int count =0;
            for(int j=0; j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }else{
                    break;
                }
            }
            cont1s[i]=count;

        }
        return cont1s;
    }


    private static int[] mainLogic(int[] ans, int[] temp,int k){
        // first create an array of size k:
        int[] result = new int[k];

        // then traverse the temp array and copy the k smallest elements to result array
        for(int i=0; i<k; i++){
            for(int j=0;j<ans.length;j++){
                if(temp[i] == ans[j]){
                    result[i]=j;
                    ans[j]=-1;
                    break;
                }
            }
        }
        return result;
    }

    // TimeComplexity: O(n^2)
    // SpaceComplexity: O(n)
    public int[] kWeakestRows(int[][] mat, int k) {
        // first count 1's in each row then add push into array asn;
        int ans[] = count1Add(mat);

        // then copy the ans[] into temp[]
        // them sort the temp[]
        int temp[] = new int[ans.length];
        for(int i=0; i<ans.length; i++){
            temp[i]=ans[i];
        }
        Arrays.sort(temp);

        // then compare the ans[] and sorted temp[] and push into result[]
        int[] result = mainLogic(ans,temp,k);

        // then simply return
        return result;
    }


    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},
                       {1,1,1,1,0},
                       {1,0,0,0,0},
                       {1,1,0,0,0},
                       {1,1,1,1,1}};
        int k = 3;
        TheKWeakestRowsinaMatrix obj = new TheKWeakestRowsinaMatrix();
        int[] result = obj.kWeakestRows(mat, k);
        for(int ele: result){
            System.out.print (ele+" ");
        }
    }
}

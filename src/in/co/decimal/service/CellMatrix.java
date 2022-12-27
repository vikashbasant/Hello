package in.co.decimal.service;

public class CellMatrix {
    public static int matrix(int n, int m, int[][] mat){
        int[][] ans = new int[m][n];
        for(int[] ma: mat){
            int row = ma[0];
            int col = ma[1];

            for(int i=0; i<n; i++){
                ans[row][i] += 1;
            }
            for(int j=0; j<m; j++){
                ans[j][col] += 1;
            }
        }
        int count = 0;
        for(int[] i: ans){
            for(int j: i){
                if(j%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int m = 2,n=2;
        int[][] mat = {{1,1},{0,0}};
        int result = matrix(n, m, mat);
        System.out.println(result);

        String s = "abcd";
        int i = s.indexOf (s, 1);
        System.out.println (i);
    }
}

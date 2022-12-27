package in.co.decimal.service;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i == j || (i+j) == n-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum = diagonalSum(mat);
        System.out.println (sum);
    }
}

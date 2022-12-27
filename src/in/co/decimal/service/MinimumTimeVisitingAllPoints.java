package in.co.decimal.service;

public class MinimumTimeVisitingAllPoints {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;
        int sum = 0;
        for(int i=1; i<n; i++){
            int temp = 0;
            for(int j=0; j<m; j++){
                int internalResult = Math.abs(points[i][j]-points[i-1][j]);
                temp = temp < internalResult ? internalResult: temp;
            }
            sum+=temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] points= {{3,2},{-2,2}};
        int result = minTimeToVisitAllPoints(points);
        System.out.println (result);
    }
}

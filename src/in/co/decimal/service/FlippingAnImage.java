package in.co.decimal.service;

public class FlippingAnImage {

    // TimeComplexity: O(N^2)
    // SpaceComplexity: O(N^2)
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int[][] result = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i][m-j-1] = image[i][j]==1 ? 0 : 1;
            }
        }
        return result;
    }

    // TimeComplexity: O(N^2)
    // SpaceComplexity: O(1)
    public static int[][] flipAndInvertImageBetter(int[][] image) {
        // get 1D array at time:
        for(int[] img: image){
            // then used 2 pointer approach:
            // swap and toggle:
            for(int i=0,j=img.length-1; i<=j; i++, j--){
                int temp = img[i];
                img[i] = 1-img[j];
                img[j] = 1-temp;
            }
        }
        // finally return same 2D array:
        return image;
    }

    // TimeComplexity: O(N^2)
    // SpaceComplexity: O(1)
    public static int[][] flipAndInvertImageMuchBetter(int[][] image) {
        int n = image.length;
        // get 1D array at time:
        for(int[] img: image){
            // swap and toggle:
            for(int i=0; 2*i<n; i++){
                if(img[i] == img[n-i-1]){
                    img[i] = img[n-i-1]^=1;
                }
            }
        }
        // finally return same 2D array:
        return image;
    }


    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] result = flipAndInvertImageMuchBetter(arr);
        for(int[] eles: result){
            for(int ele: eles){
                System.out.print (ele+" ");
            }
            System.out.println (" ");
        }

    }
}

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78,99,34,56},
        };
       int target= 56;
       int[] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col= 0; col<arr[row].length; col++){
                if( arr[row][col]== target){
                    return new int[]{row, col};
                    /*We can't write return {row,col} b/c this is initialisation
                     but we can't initialise without declaring it, so we need to use
                     new keyword.*/
                }
            }
        }
        return new int[]{-1, -1};
    }
}

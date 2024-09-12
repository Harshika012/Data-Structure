import java.util.Arrays;
import java.util.Scanner;
public class Array2Dinput {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        Scanner in= new Scanner(System.in);
        System.out.println(arr.length);// no. of rows, here 3
        /* The outer for loop will run 3 times
         and the inner loop will run arr[row].length time for each outer loop iteration.
         arr[1].length means length of 1st row or 1st 1D array.
         */
        for(int row= 0; row< arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
                arr[row][col]= in.nextInt();
            }
        }
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        /*Here , as per enhanced for loop syntax : for( datatype num: array)
                                                       System.out.println(Arrays.toString(num));
                                                        Here num represents the elements of array
            But here assume that each element of arr is also an array So a is an array which represents each element
            of the arr. so for understanding this. Let's assume that there are 3 elements in arr and each element is
            itself an array. like { [1,2,3], [4,5,6], [7,8,9] }
            1st element: [1,2,3] ; 2nd: [4,5,6]; 3rd: [7,8,9] */

        }
    }
}

import java.util.Arrays;
public class SelectionSortRec {
    public static void main(String[] args) {
  int[] arr = {4,3,2,1};
  Selection(arr, arr.length , 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr, int r, int i, int max){
        /*max is the index of the maximum element. We are taking it in
         argument because we need to pass the value of max in future recursion
         calls.*/
        if(r==0){
            return;
        }
        if(i<r) {
            if (arr[i] > arr[max]) {
                //Here max index will be given by the user
                Selection(arr, r, i + 1, i);
                //Now arr[max] will be arr[i] , since arr[i] > arr[max]
            } else {//if arr[max] is still greater, then we only increment i to i+1
                //now arr[ max] will be compared to arr[i+1].
                Selection(arr, r, i + 1, max);
            }
            /*After this arr[max] would be pointing to the largest element of array.*/
        }
            else {
                int temp = arr[max];
                arr[max]= arr[r-1];
                arr[r-1]= temp;
             //Now maximum element is at last index , so we will be in new line.
                Selection(arr, r-1,0,0);
         /*Here we set max =0 , so arr[max] is set to 0 and again it will find
         the index of maximum element and swap it with 2nd last element and so on.*/

        }

    }
}


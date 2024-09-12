import java.util.Arrays;
public class BubbleSortRec {
    public static void main(String[] args) {
    int[] arr = {4,3,2,1};
        Bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr, int r,int i) {
        if (r== 0) {
            return;
        }
        if(i < r) {
            if (arr[i + 1] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            Bubble(arr, r, i + 1);
        }
        else {
         Bubble(arr, r-1, 0);
         /*We are reducing r by 1 b/c the last index will already have the
          largest element after 1st call , it will be the sorted part of
          the array.*/
        }
    }
}

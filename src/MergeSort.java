import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    arr = mergeSort(arr);
    //Here we are updating the original array
    /*But the function does not change the original array, it creates a new object
     if we store the mergeSort(arr) in some other variable like ans but try to
     print arr then original array will be printed without any changes, in that case
     to get the sorted array you need to print ans and not arr.*/
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length== 1){
            return arr;
        }
        int mid = arr.length /2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));//mid is exclusive
     //Arrays.copyOfRange copies a specified range of array to a new array.
     //This function include the 1st index(0 in left) and exclude the last( mid in left.)
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length)); //Here mid is inclusive
         /*Here we are not sorting original array, we are creating two new
          objects(array) and sorting it and then merge them.*/

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i= 0;
        int j= 0;
        int k= 0;

        while (i< first.length &&  j< second.length){
            if(first[i] < second[j]){
               mix[k]= first[i];
               i++;
            }
            else{ mix[k] = second[j];
            j++;
            }
            k++;
        }
//It may be possible that 1 of the arrays is not complete.
//Copy the remaining elements.
       while (i<first.length){
            mix[k]= first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k]= second[j];
            j++;
            k++;
        }
        return mix;
    }
}

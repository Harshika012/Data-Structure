
public class LinearSearch2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,67,8,9,10,-11};
        int tar = 10;
        System.out.println(linearSearch(nums, tar));

    }

    //Search in the array: return the index if item found
    //otherwise if item not found , return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        //Here we are not making use of index , so we can replace it with enhance for loop.
        for (int element : arr) {
            if (element == target) {
                return element;

            }
        }
        /*if none of the return statements above have executed that means
         target not found.*/
        return Integer.MAX_VALUE;
    }
}
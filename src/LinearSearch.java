public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,67,8,9,10,-11};
        int tar = 10;
        System.out.println(linearSearch(nums, tar));

    }

    //Search in the array: return the index if item found
    //otherwise if item not found , return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
            {  return i;

            }
        }
        /*if none of the return statements above have executed that means
         target not found.*/
        return -1;
        /*If we need to return the element then, we need to change return value
         from -1 to Integer.Max_value, it will return some random stuff. we need to
         do this b/c -1 might be the target . then we will be confused.
         */
    }
}

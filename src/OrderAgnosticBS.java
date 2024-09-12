public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr= {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45,89};
        int[] arr2= { 99, 80,75, 22, 11, 10, 5,2, -3};
        int target = 22;
        int ans = OABS(arr2, target);
        System.out.println(ans);
    }
    static int OABS(int[] arr, int target){
        int start= 0;
        int end= arr.length-1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        /*Here we are using boolean operator used inside a function OABS,
         Here boolean is not a function.*/

        while(start<=end){
            int mid = start +(end -start)/2;

            if(arr[mid]== target){
                return mid;
            }
            //For Ascending order
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;}
                }
            else {
                    if(target> arr[mid]){
                        end = mid -1;
                    } else {
                        start= mid +1;
                    }
                }

            }//ending of while loop
            return -1;
        }
    }


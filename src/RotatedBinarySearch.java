public class RotatedBinarySearch {
    public static void main(String[] args) {
     int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 9,0, arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+ (e-s) /2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]) {
         //It means the 1st half(from s to mid) is sorted.
            if(target >= arr[s] && target <= arr[m]){
                search(arr, target, s,m-1);
            }
            else {
                return search(arr, target, m+1, e);
            }
        }
        if(target >= arr[m] && target<= arr[e]){
           return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}

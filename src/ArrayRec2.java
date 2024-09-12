//Linear search with recursion:
//This program will tell if target is found or not
public class ArrayRec2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 18, 19, 11};
        int target = 11;
        System.out.println(LinearSearch(arr,target,0));
    }
    static boolean LinearSearch(int[] arr, int target,int index){
        if(index== arr.length) {
            return false;
        }

        return arr[index]== target ||LinearSearch(arr,target, index+1);

    }
}

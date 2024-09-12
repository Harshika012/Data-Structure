import java.util.Arrays;
//We are using 2 functions in total here.
//Two pointer method
public class ArrayReverse2 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reverse(int[] array){
        int start =0;
        int end =array.length-1;//last index

        while(start < end){
          swap(array, start, end);//we are calling swap function here
          start++;
          end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}

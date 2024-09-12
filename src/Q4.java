import java.util.Arrays;
public class Q4 {
    public static void main(String[] args) {
        int[] arr= {0,0, 1,1,1, 2,2, 3,3, 4};
        System.out.println(NewArr(arr));
        System.out.println(Arrays.toString(arr));

    }
    static int NewArr(int[] arr){
       int j= 1;
         for(int i = 1; i< arr.length; i++){
             if(arr[i] != arr[i-1]){
                 arr[j]= arr[i];
                 j++;
             }
         }
         return j;
    }
}

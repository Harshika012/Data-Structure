import java.util.Arrays;
public class ReversingArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
         reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reverse(int[] array){
        for(int i=0; i< array.length; i++){
            for(int k=0; k<array.length/2; k++){
                int temp= array[k];
                array[k]= array[array.length-1-k];
                array[array.length-1-k] = temp;
            }

        }

    }
}


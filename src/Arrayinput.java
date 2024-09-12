import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        /*Input using for loop:, when size of array is not known */
      for(int i=0; i<arr.length; i++){
          arr[i]= in.nextInt();
      }
        for (int num : arr) {//Enhanced for loop (alt+ enter), Here we are directly getting the item without using indices of arr.
            System.out.print(num+" ");//Here num represents elements of the array, it is called for- each loop.or enhanced for loop.
        }
    }
}

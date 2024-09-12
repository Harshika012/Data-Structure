import java.util.Arrays;
import java.util.Scanner;
public class Arrayprint {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //Arrays of Primitives
            int[] arr= new int[5];
            for(int i=0; i<arr.length; i++){
                arr[i]= in.nextInt();
            }
        System.out.println(Arrays.toString(arr));
            /* It is Arrays class which has toString method which converts arr to
            string and then print it with [] and , in b/w , internally it also uses String builder
             and for loop internally and print the array. If array is empty it returns []
             and if it's null , it returns null. IT IS THE BEST METHOD TO PRINT AN ARRAY. */

        //Array of object(String)
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
         str[i]= in.next();
        }
        System.out.println(Arrays.toString(str ));
        //modify
        str[1]= "Zade";
        System.out.println(Arrays.toString(str));
    }
}

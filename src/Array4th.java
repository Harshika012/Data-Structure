import java.util.Arrays;

//Passing in functions:
public class Array4th {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[0] =99;//This will change the value of nums[0]= 99
        //this is called mutable behaviour, Arrays are mutable in Java and strings are immutable in Java
        //Mutable means we can change the object.
    }
}

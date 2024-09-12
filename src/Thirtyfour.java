import java.util.Arrays;

//Change values:
//This is call by value:
public class Thirtyfour {
    public static void main(String[] args) {
         //create an array
        int[] arr= {1,3, 2, 45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));//It is a method to print array.
    }
    static void change(int[] nums){
        nums[0] = 99;//if you make change to the object via this ref variable, same object will be changed
        //we are changing the value at 0th index of arr via nums.
    }
}


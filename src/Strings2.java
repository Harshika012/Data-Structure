import java.util.Arrays;

public class Strings2 {
    public static void main(String[] args) {
        /*Anything you print in println method it calls the toString Method
         Everything is converted into String ,and then it is printed.*/
        System.out.println(56);
        /*We can also print integer by Making wrapper class and applying
        to.String method manually:*/
        Integer num = new Integer (56);
        // System.out.println(num.toString()); (you don't need to add .toString)
        System.out.println(num);//It will be done automatically like in this line.

        System.out.println("Kunal");
        /* System.out.println(new int[]{2, 3, 4, 5});

        But in the case of this array, it is printing any random value.
        For printing array we need to use Arrays.toString() method.*/
        System.out.println(Arrays.toString(new int[]{2, 3,4, 5 }));

        String name = null;
        System.out.println(name);
    }
}

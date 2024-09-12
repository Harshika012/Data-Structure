import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int n = 1234;
        rev(n);

    }
    static void rev (int n){
        if(n==n%10){
            System.out.print(n);
        }
        else{
            System.out.print(n%10);
            rev(n/10);
        }
    }
    /*We cannot use this function to check whether a number is palindrome
     or any other thing b/c it is returning nothing , so to check that
      We need to use the function which return reverse of a number.
      So we need to use 9_2 function.*/
}

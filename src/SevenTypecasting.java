import java.util.Scanner;
public class SevenTypecasting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float num= sc.nextFloat();//it will take even an integer as input b/c float is bigger than the integer but vice- versa will
                                  // not happen b/c integer is smaller than float.
        System.out.println(num);
        /* When we want to convert a bigger data type in smaller one, we do explicit conversion i.e called narrowing conversion.  */
    }
}

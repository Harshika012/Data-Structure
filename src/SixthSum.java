import java.util.Scanner;
public class SixthSum {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= a+b;
        System.out.println("Sum is "+sum);
        System.out.println("Sum is: " +(a+b));/* Without using 3rd variable. */
    }
}

//Armstrong no.: eg: 153; 1^3+ 5^3+ 3^3 = 1+ 125+ 27= 153
import java.util.Scanner;
public class Fortyone {
    public static void main(String[] args) {


        Scanner arm = new Scanner(System.in);
        int num = arm.nextInt();
        System.out.println(armstrong(num));
    }
    static boolean armstrong(int n){
        int original = n;
        int sum= 0;
        while(n >0){
            int rem = n % 10;
            n= n/10;
            sum = sum + rem* rem* rem;
        }
        return sum == original;
    }
}

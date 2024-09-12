import java.util.Scanner;
public class Forty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        isPrime(n);
    }
    static void isPrime(int n) {
        int c=0;
        for(int i=1; i<=n; i++){
            if(n % i ==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("No. is prime");
        }
        else
            System.out.println("No. is not prime");

    }
}

import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the num.:");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        if(num==0){
            System.out.println("false");
        }
        boolean ans = (num &(num-1))==0;
        System.out.println(ans);
    }
}

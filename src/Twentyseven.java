import java.util.Scanner;
public class Twentyseven {
    public static void main(String[] args) {

        System.out.println("Sum is " +sum2());
        /* [Or]
         int ans= sum2()
         System.out.println(ans);
         */
    }
    //return the value:
    static int sum2(){
        System.out.println("Enter two no.s");
        Scanner no= new Scanner(System.in);
        int num1= no.nextInt();
        int num2= no.nextInt();
        int sum = num1+ num2;
        return sum;//return means function is over. No more statement could be added in function.
    }
}


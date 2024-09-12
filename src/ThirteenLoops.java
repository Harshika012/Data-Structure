import java.util.Scanner;
public class ThirteenLoops {
    public static void main(String[] args) {

        // Q. Print numbers from 1 to 5
        /* Syntax for 'for' loop is similar as C
            for(initialization; condition; increment/ decrement) {
                          BODY}
                           */
         /* for(int num=1; num <= 5; num+=1){
            System.out.println(num);
        } */
//Print no.s from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    for(int num=1; num<=n; num++){
        System.out.print(num +" ");
    }
    }
}

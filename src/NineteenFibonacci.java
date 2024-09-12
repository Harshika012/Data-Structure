import java.util.Scanner;
//Fibonacci series: 0,1,1,2,3,5,8,13,21,...
public class NineteenFibonacci {
    public static void main(String[] args) {
        System.out.println("Enter n: ");//n starts from 0
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int a = 0;
        int b = 1;
        int count= 2;/* since, 1st two no.s is already given , i.e. 0 and 1, so at n=0, count=1, we have a=0
                       at n=1, count =2, we have b=1.
        */
        while(count <=n){
      int temp= b;
      b= a+b;
      a= temp;
      count++;
        }
        System.out.println(b);
    }
}

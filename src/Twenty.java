import java.util.Scanner;
public class Twenty {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("Enter the digit whose no. of occurrence you need to find: ");
        Scanner sc= new Scanner(System.in);
        int d= sc.nextInt();
        int count=0;
        while(n>0){
        int rem= n % 10;
        if(rem== d){
            count++;
        }
        n= n/10;
        }
        System.out.println("No. of times "+ d +" occurred: "+ count);

    }
}

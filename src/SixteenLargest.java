import java.util.Scanner;
public class SixteenLargest {
    public static void main(String[] args) {
        System.out.println("Enter 3 no.s:");
    Scanner in= new Scanner(System.in);

    int a= in.nextInt();
    int b= in.nextInt();
    int c= in.nextInt();
    //Q: Find largest of 3 numbers.
        int max= a;
        if(b> max){
            max= b;
        }
        if(c> max){
            max= c;
        }
        System.out.println("Largest among these three is: "+max);
    }
}

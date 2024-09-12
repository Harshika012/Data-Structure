import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args) {
        System.out.println("Enter 3 no.s:");
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();

        int max= Math.max(c, Math.max(a,b));
        /*In math class, we have 'Math.max()' function, we can call it to
          Find maximum of two no.*/
        System.out.println("Largest no. among these 3: " +max);
    }
}

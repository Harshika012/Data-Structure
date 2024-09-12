import java.util.Scanner;
public class FifthInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno= input.nextInt();
        System.out.println("Your roll number is "+ rollno);
        int a=10; // 10 is object known as literal, a is identifier
        /*int b= 234_000_000;  we can't wrire 234,000,000 as it is wrong according to syntax, but _ will be ignored while operation.
        System.out.println(b);*/
    }
}

import java.util.Scanner;
public class TwentySixMethods {
    //You can define function either before or after main function. Both ways it will work.
    //Here I'm defining function before main function:
    static void sum() {
        System.out.println("Enter two no.s:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    public static void main(String[] args) {
        sum();//Calling the function
        sum();
        }
    }

/*
         return_type name(){
        //body
        return statement;
        }
        */

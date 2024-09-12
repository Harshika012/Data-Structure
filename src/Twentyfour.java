import java.util.Scanner;
public class Twentyfour {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit = in.next();
//Enhanced Switch ( Select "switch" and click alt + enter then click on enhanced switch.
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}

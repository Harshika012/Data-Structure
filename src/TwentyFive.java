import java.util.Scanner;
public class TwentyFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department= in. next();

        switch(empID){

            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana" );
                break;
            case 3:
                System.out.println("Employ no. 3");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                    break;
                }
                break;

            default:
                System.out.println("Enter correct EmpID");

        }
    }
}

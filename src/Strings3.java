//PrettyPrinting: Formatted Printing
public class Strings3 {
    public static void main(String[] args) {
        float a= 453.1274f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();
        /*printf is also a method of printing in Print stream
         It prints formatted number, also round of the no.
        % is placeholder, till how many decimal values you want to print,
         here it is 2, Output will be 453.13 after rounding off.*/

        System.out.printf("Pie: %.3f", Math.PI);//This will print the value of pi, i.e. 3.14
        //Math is a class, it has constant variable like PI.
        System.out.println();
        System.out.printf("Hello my name is %s and I an %s", "Kunal", "Cool");
        /*The order in which you placed the placeholders, in that order you have to
         Place the variables.*/
    }
}

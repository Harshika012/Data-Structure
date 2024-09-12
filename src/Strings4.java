//OPERATORS
import java.util.ArrayList;
/* In String Operations '+' is overloaded, means it offers more functionalities:
  it concatenates 2 strings */
//But this is not in the case of other operators like '-'.
public class Strings4 {
    public static void main(String[] args) {
        System.out.println("a" +"b"); //This will give ab
        System.out.println('a' +'b');//This is adding ASCII values of both.
        System.out.println('a'+ 3);//ASCII value of a ,i.e 97 + 3= 100
        System.out.println((char) ('a' +3));//Typecasting, giving char of ASCII 100,i.e. d.
        System.out.println("a" +1);//this will print a1
        /*When an integer is added to a String, the integer will be converted into
         its wrapper class Integer that will call toString(). Then 1 will be
         converted to string as we studied before, so it is same as "a" + "1". */
        System.out.println("Kunal" + new ArrayList<>());
        //Since Arraylist is empty so it will return empty array after Kunal.
        System.out.println("Kunal" + new Integer(56));
        //nwe Integer(56) is calling .toString like we discussed in previous codes.

        /* System.out.println(new Integer(56) + new ArrayList<>());
        This will give error b/c is java operator'+' is only defined for
        primitives or when one of the those operands is a String. */
        System.out.println(new Integer(56) +"" + new ArrayList<>());
        /*Now it will work b/c an empty String is added in the expression.
        * And the Result will be of String type.*/
        String ans = new Integer(56) +"" + new ArrayList<>();
        System.out.println(ans);
    }
}

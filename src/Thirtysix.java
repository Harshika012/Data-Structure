import java.util.Arrays;

//VarArgs: when you create a method which takes variable(different) no. of arguments.
public class Thirtysix {
    public static void main(String[] args) {
        fun(1,2,3,4,5,67);
    }
    static void fun(int ...v)//This is done when you don't know how many integers are needed to be taken as arguments.
     {
         System.out.println(Arrays.toString(v));//v is implicitly declared as an array of type int.
         //it will print all this and store it internally in an array.
    }
}

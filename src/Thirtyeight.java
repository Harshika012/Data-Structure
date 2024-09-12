/*Method overloading: Two or more functions of same name can exist
if their parameters are changed.
either the no. or the type of arguments should be diff. in both the functions*/
/*In fun functions, no. of argument is same but type is diff.
 In sum functions no. of argument is different and type is same.*/
public class Thirtyeight {
    public static void main(String[] args) {
        fun(67);//It will call 1st fun with argument int type.
        fun("Hell");//It will call 2nd fun with argument string.
        System.out.println( sum(2,3));
        System.out.println(   sum(2,3,4));
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}

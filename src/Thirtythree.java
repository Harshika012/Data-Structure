//Try swapping using function:
public class Thirtythree {
    public static void main(String[] args) {
        int a= 10;
        int b =20;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap( int num1, int num2){
        //in Primitives like int, short, char, byte , value is passed.
        //But in objects and stuffs like strings value of reference variable is passed.
//Here also value of num1 is copy of and num2 is of b, so they hold values 10 and 20 resp.
        int temp= num1;//temp=10
        num1= num2;    //num1= 20
        num2= temp;    //num2= 10
        /* In this function scope they are swapped but the original values remain unchanged.  */
    }
}

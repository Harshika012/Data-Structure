//Odd or even:
public class BitwiseOperator1 {
    public static void main(String[] args) {
   int n= 68;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n){
        return (n & 1)==1;
    }
}

//Product of digits of a number:
public class Recursion7 {
    public static void main(String[] args) {
        System.out.println(prod(1344));
    }
    static int prod(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * prod(n/10);
    }
}

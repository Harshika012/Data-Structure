public class Recursion5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return fact(n-1) * n;
    }
}

//Print 5432112345 using Recursion:
public class Q5 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}

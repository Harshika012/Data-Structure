public class Recursion9_1 {
    public static void main(String[] args) {
        Reverse(1234);
        System.out.println(sum);
    }
    static int sum = 0;
    static void Reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10 ;
        sum = sum * 10 +rem ;
        Reverse(n/10);
    }
}
/*Here we are using an outside value 'sum' as the main value and not
  returning any value from the function. So it is like cheating. */
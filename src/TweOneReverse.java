public class TweOneReverse {
    public static void main(String[] args) {
        int n= 12345;
        int reverse=0;
        while(n!=0)/* also use (n>0)*/
            {
            int rem= n%10;
            reverse= reverse*10+ rem;
            n/= 10;
        }
        System.out.println(reverse);
    }
}

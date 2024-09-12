//This will give no. of digits 10 have in binary .
public class noOfDigits {
    public static void main(String[] args) {
        int n= 10;
        int b= 2;// for binary

        int ans= (int)(Math.log(n)/ Math.log(b)) + 1;

        System.out.println(ans);
    }
}

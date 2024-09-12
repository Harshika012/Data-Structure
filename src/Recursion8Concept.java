public class Recursion8Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //fun(n--);: This will lead to infinite recursion or Stack overflow.
        fun(--n);
        /* n--: it will pass the value of n first and then subtract it after wards
                So it is always passing 5 then subtracting  after function call ends.
                So, it will keep passing 5 always in function call.
          --n: it will subtract first and then pass the value of 5. */


    }
}

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
        /*Fibonacci no. is a linear recurrence relation, it is very inefficient
         with a huge time complexity,i.e. golden ratio raise to the power n,
         if you put n= 50, the program will get stuck. So this program is
         not efficient for even n= 50.*/
    }
    /*In previous example we were calling only 1 function from other like
     we were only calling print(2) inside print(1) but here we are calling
     2 functions from one function.Eg: fibo(4) is calling fibo(3) and fibo(2)
     as fibo(4) = fibo(3) + fibo(2) .*/
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2);
        /*This is not tail recursion, for fibo(n), we are firstly calling
         fibo(n-1) and fibo(n-2) and then adding it and returning it
         for the final answer.
        So this extra step of adding and returning is not a tail recursion.*/
    }
}

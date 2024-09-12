//Numbers example:
public class Recursion2 {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it.
        //print first 5 numbers : 1 2 3 4 5
      print1(1);
    }
    //All the function calls that happen in program goes in stack memory.
    static void print1(int n){
        //print1 function prints 1 and calls print2() function.
        System.out.println(n);
        print2(2);
        /* Now, print1 had already printed 1 and call print2 : to print 2
         and ask other functions to print rest of the numbers.
         print2 says print1 to stay in the stack,and it will take care of
         rest of the numbers.
          Now print2 will be inside the stack.*/
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    /*print2 is like, hey print3, I have not finished executing, print1 and the
    main function are waiting on me to print 2,3,4 and 5, I have printed 2,
    so can you make sure numbers 3, 4 and 5 are printed. While you do so,
    I will relax in stack memory.
     print3 will print 3  and call print4 to print 4 and 5.*/
    static void print3(int n){
        System.out.println(n);
        print4(4);
        //Like wise print4 will print 4
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    //After printing 4 it will call print5 to print 5.
    static void print5(int n){
        System.out.println(n);
    }
}

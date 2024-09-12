//We are going to create function calling other function
public class Recursion1 {
    public static void main(String[] args) {
        message();
    }
    static void message() {
        System.out.println("Hello World");
        message1();//function is calling another function.
    }
    static void message1() {
        System.out.println("Hello World");
        message2();//function is calling another function.
    }
    static void message2() {
        System.out.println("Hello World");
        message3();//function is calling another function.
    }
    static void message3() {
        System.out.println("Hello World");
        message4();//function is calling another function.
    }
    static void message4() {
        System.out.println("Hello World");
    }
}

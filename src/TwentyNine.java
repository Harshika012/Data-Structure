public class TwentyNine {
    public static void main(String[] args) {
        String personalized = myGreet("Harshika");
        System.out.println(personalized);
    }

     static String myGreet(String name) {
        String message=  "Hello " + name;
        return message;
    }
}

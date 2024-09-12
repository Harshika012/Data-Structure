import java.util.Arrays;

public class StringsMethod {
    public static void main(String[] args) {
        String name ="Harshika Kumari";
        System.out.println(name.toCharArray()); //This will print string directly.
        System.out.println(Arrays.toString(name.toCharArray()));
        //This will print each character in array form.
        //As we can't directly use System.out.println (Arrays.toString(name));
        System.out.println(name.toLowerCase());
        //This is creating new object in lower case, the real one stays same:
        System.out.println(name);
        System.out.println(name.indexOf('a'));//It will print the index of 'a'
        System.out.println("  Harshika  ".strip());//Extra spaces will be removed
        System.out.println(Arrays.toString(name.split("a")));
        //It will remove 'a' and split it at the places of 'a'
        //It creates an array of elements after splitting it , here we get 4 elements

    }
}

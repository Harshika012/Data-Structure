public class Strings {
    public static void main(String[] args) {
        String a = "Harshu";
        String b = "Harshu";

        System.out.println(a==b);
        /*This is giving True as Output, that means the value and reference variable
         both are same, a and b both are pointing to same object in heap*/
        /*But still you want to create new string with same Object name,
         'new' keyword will be used:*/
        String c = new String("Kunal");
        String d = new String("Kunal");
        System.out.println(c==d);
        /*This will give false, even value is same for both ,but they are not pointing
         to same object. */

        System.out.println(c.equals(d));
        /*This will gives true, b/c it doesn't care whether the reference variables
         are pointing to same object or not.
         It only cares about the value*/
        System.out.println(d.charAt(0));
        //It will give char at 0th index of string
        //we can't get char. by d[0] unlike in array .

    }
}

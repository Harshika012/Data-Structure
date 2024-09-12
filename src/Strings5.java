//Performance(Even imp. for interview rounds)
public class Strings5 {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++){
            char ch= (char)('a' + i);
           System.out.println(ch);
            series= series + ch ;//series += ch

        }
        System.out.println(series);

        System.out.println("a" + 'b');
        //if one of the data type is string, ans will be string, ab.

        /*    series= series + ch ;
        There is a problem in this, with every iteration a new char is
         added to the string and series starts to point on the new object.
         Eg: Firstly  series String is empty and with first iteration a is added to
         the string, now series is pointing to "a" not "" again with 2nd iteration
         b is added and String becomes "ab" now series is pointing to "ab" and
          nothing is pointing to "a". like wise with every iteration more and
          more memory will be wasted*/

    }
}

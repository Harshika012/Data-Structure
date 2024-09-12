import java.util.Scanner;
public class EighteenCasecheck {
    public static void main(String[] args) {
        System.out.println(" Enter an alphabet:");
        Scanner in = new Scanner(System.in);

        char ch= in.next().trim().charAt(0);
        /*next() is used to take a string(word) input to take a letter as input .Here we need to use charAt(0)
         it will take char. at 0th position of a string , i.e. a letter or alphabet.
         So even if you input a word, only 1st letter of that word will be considered .*/
        if(ch>='a'&& ch<= 'z'){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Uppercase");

        }
    }
}


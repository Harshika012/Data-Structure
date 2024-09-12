//Palindrome string: abcdcba; it reads same from backward or forward.
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }
    static boolean isPalindrome(String str){
        if(str== null || str.length() == 0){
            return true;
         //If we don't add this condition then for empty string index will come out od bound.
        }
        str= str.toLowerCase();
        for(int i=0; i<= str.length() /2; i++){
            //Here length is a method/function but in arrays it is a variable
            //Internally both are doing same thing.
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!= end){
                return false;
            }
        }
        return true;
    }
}

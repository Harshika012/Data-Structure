//Replacing a part of word when the word is incomplete:
//Like it will skip app when it's not apple,
public class Rec5 {
    public static void main(String[] args) {
        System.out.println(skipApp(" apple provides many apps and games!"));
    }
    static String skipApp(String word){
        if(word.isEmpty()){
            return "";
        }
        if (word.startsWith("app") && !word.startsWith("apple")) {
            return skipApp(word.substring(3));
        }
        else{
            return word.charAt(0) + skipApp(word.substring(1));
        }
    }
}

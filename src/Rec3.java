public class Rec3 {
    public static void main(String[] args) {
        System.out.println(skipApple("Hello apple of my eye!"));
    }
    static String skipApple(String word){
        if(word.isEmpty()){
            return "";
        }
        if (word.startsWith("apple")) {
            return skipApple(word.substring(5));
        }
        else{
            return word.charAt(0) + skipApple(word.substring(1));
        }
    }
}

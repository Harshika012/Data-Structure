public class Rec4 {
    public static void main(String[] args) {
        System.out.println(replaceApple("Eat one Apple a day, keeps doctor away!!"));
    }
    static String replaceApple(String sentence){
        if(sentence.isEmpty()){
            return ("");
        }
        if(sentence.startsWith("Apple")){
            return replaceApple(sentence.replace("Apple", "chocolate"));
        }
        else
            return  sentence.charAt(0)+ replaceApple(sentence.substring(1));
    }
}

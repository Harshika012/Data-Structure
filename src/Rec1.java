public class Rec1 {
    public static void main(String[] args) {
     removeA("", "baccdah");
    }
    static void removeA( String ans, String word){
        if(word.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = word.charAt(0);
        if(ch =='a'){
            removeA(ans, word.substring(1));
        //.substring() skips the no. of letters it is provided with, here it is skipping 1 letter.
        }
        else{
            removeA(ans+ ch, word.substring(1));
        }

    }
}

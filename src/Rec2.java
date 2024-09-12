public class Rec2 {
    public static void main(String[] args) {
        System.out.println(skipA("baccdah"));
    }
  static String skipA(String word){
        if(word.isEmpty()){
            return "";
        }
        char ch = word.charAt(0);

      if (ch == 'a') {
          return skipA(word.substring(1));
      }
      else{
          return ch + skipA(word.substring(1));
      }
  }
}

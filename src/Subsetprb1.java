public class Subsetprb1 {
    public static void main(String[] args) {
        subseq("", "abc");
    }
    static void subseq(String ans, String ques){
        if(ques.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);

        subseq(ans+ ch, ques.substring(1));
        subseq(ans, ques.substring(1));
    }
}

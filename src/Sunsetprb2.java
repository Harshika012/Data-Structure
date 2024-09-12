import java.util.ArrayList;

public class Sunsetprb2 {
    public static void main(String[] args) {
        System.out.println(subset("", "abc"));
    }
    static ArrayList<String> subset(String ans, String ques){
        if(ques.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = ques.charAt(0);
        ArrayList<String> left = subset(ans + ch, ques.substring(1));
        ArrayList<String> right = subset(ans, ques.substring(1));

        left.addAll(right);
        //Adding all the elements of right side in left.
        return left;
    }
}

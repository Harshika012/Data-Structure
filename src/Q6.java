import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter the number of Gold, Silver and Bronze medals respectively: ");
        Scanner in = new Scanner(System.in);
        int gold = in.nextInt();
        int silver= in.nextInt();
        int bronze = in.nextInt();
        medal(gold, silver, bronze);
    }
    static void medal(int gold, int silver, int bronze){
         if(gold==0&& silver==0&& bronze==0){
             System.out.println("No medal");
         }
         else if(gold>=5&& silver>=5&& bronze >= 5){
             System.out.println("Chief is happy");
         }
         else {
             int MinMedals = 5;
             int G = Math.max(0, MinMedals - gold);
             int S = Math.max(0, MinMedals - silver);
             int B = Math.max(0, MinMedals - bronze);

             int RequiredMedals = G + S + B;
             System.out.println( "No. of more medals required: "+RequiredMedals);
         }
    }
}

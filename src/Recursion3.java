/*Function calling itself:*/
public class Recursion3 {
    public static void main(String[] args) {

        print(1);
    }
    static void print(int n){

        if(n==5){
            System.out.println(5);
            return;
        }/*Base condition: Condition where recursion stops making new calls. */
        System.out.println(n);

        print(n+1);
//This is tail recursion, here we have the last statement in the function call
    }
}

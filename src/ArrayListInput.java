import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListInput {
    public static void main(String[] args) {
        Scanner inn= new Scanner(System.in);
       ArrayList<Integer> list= new ArrayList<Integer>(5);

        for(int i=0; i<5;i++){
            list.add(inn.nextInt());
        }
        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
            //pass index her , list[index] syntax will not work here
            //System.out.println(list[1]): This don't work in ArrayList
        }

        System.out.println(list);

    }
}


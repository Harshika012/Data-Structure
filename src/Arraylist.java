import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        //Regardless of initial size 10, we can add as many elements as we want.

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);
        //add is method of list to add new elements in list
        System.out.println(list.contains(3));
        //contains check if an element is present in list or not.
        list.set(0,99);// it will update 0th index to 99, i.e 1 to 99 here.
        System.out.println(list);
        list.remove(2);//removes element at index 2, here it is 3
        System.out.println(list);
    }
}

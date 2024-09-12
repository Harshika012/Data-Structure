public class Array {
    public static void main(String[] args) {
        int[] ros = new int[5];

        System.out.println(ros[0]);
  /*When we do not store any element in integer type array , it stores 0
    like this array is like int[] ros ={0, 0, 0 ,0 ,0}*/

    String[] arr = new String[4];

        System.out.println(arr[0]);
        /*When we don't store anything in non primitives like String it has "null" value */
        /* We can assign null to non primitives but not primitives
         int a = null; this is wrong
         String  str= null; this could be done.*/
    }
}
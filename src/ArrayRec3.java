//This will give all the indices where target 4 is present:
//2nd way without creating List outside the function:
import java.util.ArrayList;
public class ArrayRec3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4,4, 5};
        System.out.println(findAllIndex(arr,4, 0, new ArrayList<>()));
    }
      static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target, index+1, list);
      }
}

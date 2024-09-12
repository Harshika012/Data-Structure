public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78,99,34,56},
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max= arr[0][0];//or You can use max= Integer.MIN_VALUE
        for (int[] ints : arr) {//in arr, every element is an integer array itself, it is represented by ints here.
            for (int element : ints) {// each ints array has integer elements represented by element.
                if (element > max) {
                    max = element;

                }
            }
        }
        return max;
    }
}

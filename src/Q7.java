public class Q7 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 4};
        int result = countSuperiorElements(arr);
        System.out.println("Number of superior elements: " + result);
    }

    public static int countSuperiorElements(int[] arr) {


        int count = 0;
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                count++;
                maxFromRight = arr[i];
            }
        }

        return count;
    }
}
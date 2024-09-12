public class ArrayMaxinRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 17, 19};
        System.out.println(maxRange(arr,3,4));
    }
    static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start ; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

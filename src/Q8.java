public class Q8 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,1,4};
        System.out.println(Superior(arr));
    }
    static int Superior(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            boolean isSuperior = true;
            if(i > 0 && arr[i] <= arr[i-1]){
                isSuperior = false;
            }
            if(i < arr.length - 1 && arr[i] <= arr[i+1]){
                isSuperior = false;
            }
            if(isSuperior){
                count++;
            }
        }
        return count;
    }
}


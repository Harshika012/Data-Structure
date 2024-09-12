public class Q3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,1};
        int sum = 0;
        int smallest= Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(arr[i])) {
                sum+= arr[i];
                if (smallest > arr[i]){
                    smallest = arr[i];
                }
            }
                if (isPrime(arr[i])) {
            sum+= arr[i];

                if(isPrime(arr[i])){
                    if (smallest > arr[i]){
                        smallest = arr[i];
                    }
                }
            }
        }
        sum = sum - smallest;
        System.out.println(sum);
    }
    private static boolean isPrime(int num){
        int count =0;
        for (int i = 1; i<= num; i++){
            if( num% i == 0){
                count++;
                }
            }
        if(count ==2){
            return true;
        }
       return false;
    }
}

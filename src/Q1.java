public class Q1 {
    public static void main(String[] args) {
   int m = 100;
   int n = 200;
        System.out.println(CountSpecific(m, n));
    }
    static int CountSpecific(int m, int n){
        if( m>n){
            return -1;
        }
        int count =0;

        for (int i= m; i<=n ;i++){
            if( !digits(i)){
                count++;
            }
        }
       return count;
    }
    private static boolean digits(int n){
        while(n >0){
            int digit = n % 10;
            if (digit != 1&& digit != 4 && digit !=9){
                return true;
            }
            n = n/10 ;
        }
        return false;
    }
}

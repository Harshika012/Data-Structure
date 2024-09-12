public class Q2 {
    public static void main(String[] args) {
     int a =8;
     int m = 4;
     int rs = 6;
        System.out.println(BalanceFruits(a,m,rs));
    }

    static int BalanceFruits(int a, int m, int rs) {
       if(a>m){
           int buyM = (a-m);
           int money =  buyM *1;
           rs = rs- money;
       }
       if ( a<m){
           int sellM = (m - a);
           int moneyy =  sellM * 1;
           rs = rs + moneyy;
       }
     return rs;
    }

}

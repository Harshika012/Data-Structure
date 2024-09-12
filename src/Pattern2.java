public class Pattern2 {
    public static void main(String[] args) {
        star(4,0);
    }
    static void star(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            star(r, c+1);
            System.out.print("*");
        }
        else {
            star(r-1, 0);
/*Here star(3,0) is called and a new line is printed then a new row of
 stars are printed.*/
            System.out.println();
        }

    }
}

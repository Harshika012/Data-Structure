public class FiboTimeComplexity {
    public static void main(String[] args) {
   // for(int i=0; i<11; i++){
   //     System.out.println(fiboformula(i));
   // }
        System.out.println(fiboformula(50));
        //This will print 50th fibonacci no.
    }
    static int fiboformula(int n) {
      return (int) (Math.pow(((1 +Math.sqrt(5)) / 2), n) /Math.sqrt(5));
      //This is formula after removing less dominating term.
    }

}

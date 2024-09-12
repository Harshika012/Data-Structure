public class Nine {
    public static void main(String[] args) {
        //Automatic type promotion in expressions.

        //let's say the range of byte is 256
        int a= 257;
        byte b= (byte)a;//Even after casting you can't store int in byte b/c maximum range of byte is 256
        System.out.println(b);//result will be the remainder of the value you put in byte and the actual range of byte, i.e.257 % 256=1

        byte c= 40;
        byte d= 50;
        byte e= 100;
        int f = (c *d) / e;/*Here all c,d and e are all converted into int , it is promoting each byte to int when it is evaluating this expression.
                            So this expression is evaluated using int and not byte. */
        System.out.println(f);
      /*  byte g = 50;
        b= b* 2; (This will give error b/c whenever you are performing byte evaluations automatically it get converted into int , so now this
          expression is in int ,so you cannot assign it to b , b/c b is byte .)*/
        int n= 'A';//Automatic type conversion will take place
        System.out.println(n);

        byte bb= 42;
        char cc= 'a';
        short s = 1024;
        int i = 5000;
        float ff= 5.67f;
        double dd= 0.1234;
        double result= (ff * bb )+(i / cc)- (dd * s);
                     //float     + int    - double = double
        System.out.println((ff * bb)+ " "+ (i / cc)+ " "+ (dd * s));
        System.out.println(result);

    }
}

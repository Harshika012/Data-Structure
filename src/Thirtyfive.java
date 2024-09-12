//Shadowing
public class Thirtyfive {
    static int x= 90; //static make variable object independent
    //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x ;
        //System.out.println(x);(This will give error b/c x is not initialised, only declared.
        //Scope will only begin when the value is initialised.
        x= 40;//Here it is initialised.
        System.out.println(x);//40 (class variable at line 3 is being shadowed by this)
        //Now if any operation is done on x like modify or print it will be done on it only.
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}

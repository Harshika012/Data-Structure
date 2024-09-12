import java.util.Arrays;

public class Thirtyseven {
    public static void main(String[] args) {
        fun(1,2,"Rahul","Vivek");//You can take any no. of strings here, but you need to follow the order .
        //First you need to take 2 integers and then take any no. of strings you want.
    }
    static void fun(int a, int b,String ...v)//This is done when you know 2 int type but don't know how many strings are needed to be taken as arguments.
            //Variable length argument always come at the end.
    {
        System.out.println(Arrays.toString(v));//v is implicitly declared as an array of type int.
        //it will print all this and store it internally in an array.
    }
}


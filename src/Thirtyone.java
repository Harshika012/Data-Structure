//Passing example
public class Thirtyone {
    public static void main(String[] args) {
        String name = "Hell";
        greet(name);//When name is passed into this method , actually the value of the reference variable(name)  is passed.
    }               //Copy of name is passed
                    //In java , there is no pass by reference, only pass by value.
                    //In this case it is only passing the copy of that reference.
    static void greet(String naam) {
        //naam is copy of name so both will point towards same object , i.e. Hell
        System.out.println(naam);
    }
}

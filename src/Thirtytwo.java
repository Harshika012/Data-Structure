//Try changing string values with method.
public class Thirtytwo {
    public static void main(String[] args) {
        String name= "Hell";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam) {
        //naam and name both will be pointing to the same object as naam is a copy of name.
        naam= "Heaven";//Here we are creating a new object Heaven and naam is now pointing to that.
    }                  //But name is still pointing to Hell. So the program will print Hell.
}                      //Any change in naam should be reflected in name but here we are not changing the object but creating a new object.

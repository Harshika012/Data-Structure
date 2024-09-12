public class Twelve {
    public static void main(String[] args) {
        /*
        This is same as C lang.
        Syntax of if statements:
        if (boolean expression T or F){
        //body
        }
        else{
        //do this
        }
         */
        int salary = 25400;
        if(salary> 10000) {
            salary +=2000;
        }
        else{
            salary= salary +1000;
        }
        System.out.println(salary);
    }
}

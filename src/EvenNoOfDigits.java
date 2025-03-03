//Find how many no.s of array has even no. of digits:
public class EvenNoOfDigits {
    public static void main(String[] args) {
        int [] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count= 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num) {
       int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
        /*
        The above line is simplified version of this:

        if(numberOfDigits%2== 0){
           return true;
       }
       return false;*/
    }
    //count no. of digits in a number
    static int  digits(int num) {
        if(num<0){
            num = num * -1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
       return count;
    }
}

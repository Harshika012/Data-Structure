/*Find the wealth of the richest person:
accounts= [[1, 2, 3] , [3, 2, 5]], here the 2nd person is richest with
wealth of 3+ 2+ 5= 10, so the output should be 10.
*/
public class Question {
    public static void main(String[] args) {
     int[][] accounts= {{1,2,3},{3,2,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int maxsum= Integer.MIN_VALUE;//or take maxsum= 0
        //person= row
        //account= col
        for (int[] ints : accounts) {
            //We need to take sum of elements of each row by adding elements of col 0,1and 2 of each row.
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            //now we have sum of accounts of person
            //check with overall ans
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }
}

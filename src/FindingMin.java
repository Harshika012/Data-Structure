public class FindingMin {
    public static void main(String[] args) {
        int[] arr= { 18, 12, -7, 3, 14 ,28};
        System.out.println(min(arr));
    }
    static int min(int[] array){
        int min = array[0];

        for(int i=0; i< array.length; i++){
            if(array[i]< min){
                min= array[i];
            }
        }
        return min;
    }
}

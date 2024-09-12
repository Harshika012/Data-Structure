public class EasyFindingNoOfDigits {
    public static void main(String[] args) {
        System.out.println(NoOfDigits(0));
    }
    static int NoOfDigits(int num){
        if(num<0){
            num = num * -1;}
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
        //How it is working , we will study later on in number systems.
    }
}

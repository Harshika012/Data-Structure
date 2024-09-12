/* String builder:Unlike string, string builder doesn't create new objects,
  it modifies the previous one.Here loops work similar as in array.
   It is memory efficient.
   It is mutable like arrays.*/
public class SB {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i=0; i<26; i++){
            char ch = (char)('a' +i);
            series.append(ch);
        }
        System.out.println(series);//We don't need to write .toString as it is called internally
    }
}

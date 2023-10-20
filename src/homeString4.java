import java.util.Arrays;

public class homeString4 {
    public static void main(String[] args) {
        String string="Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] arrOfStr = string.split("a");
        System.out.println(arrOfStr.length);
        //System.out.println(string.split(  "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method."));
       //String[]string1= Arrays.toString(string);
    }
}

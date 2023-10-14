public class homeString {
    public static void main(String[] args) {
        String string1="This line that i want to cut, cause it is too long";
        String string2= string1.substring(0,34);
        System.out.println(string2);
        String string3= string2.concat(" it is perfect");
        System.out.println(string3.replace("that i want","that i don`t want"));


    }
}

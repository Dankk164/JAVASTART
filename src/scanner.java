import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Я чудово тестую, що ще потрібно?");
        String string1= scanner.next("Я");
        System.out.println(string1);
        String string2=scanner.next();
        System.out.println("чудово");

    }



}

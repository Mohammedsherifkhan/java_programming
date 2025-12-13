import java.util.Scanner;

public class Digitcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("The character is a Digit.");
        } else {
            System.out.println("The character is NOT a Digit.");
        }

        sc.close();
    }
}

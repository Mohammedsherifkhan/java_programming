import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is an Uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is a Lowercase letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The character is a Digit.");
        } else {
            System.out.println("The character is a Special Symbol.");
        }

        sc.close();
    }
}

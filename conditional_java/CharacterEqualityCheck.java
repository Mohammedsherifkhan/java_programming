import java.util.Scanner;

public class CharacterEqualityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char ch1 = sc.next().charAt(0);

        System.out.print("Enter the second character: ");
        char ch2 = sc.next().charAt(0);

        if (ch1 == ch2) {
            System.out.println("The characters are equal.");
        } else {
            System.out.println("The characters are NOT equal.");
        }

        sc.close();
    }
}

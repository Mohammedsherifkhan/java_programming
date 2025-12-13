import java.util.Scanner;
public class samelastdigit {
    public static void main(String[] args) {
        int a = 27;
        int b = 57;

        if (a % 10 == b % 10) {
            System.out.println("Both numbers have the same last digit");
        } else {
            System.out.println("Numbers have different last digits");
        }
    }
}


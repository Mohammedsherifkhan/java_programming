import java.util.Scanner;
public class poweroftwo{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);{
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("power of two");
        } else {
            System.out.println(n + "  NOT a power of two");
        }

    }
}
}



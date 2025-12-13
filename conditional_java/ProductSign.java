public class ProductSign {
    public static void main(String[] args) {
        int a = -5;
        int b = 10;

        if (a == 0 || b == 0) {
            System.out.println("Product is Zero");
        } else if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println("Product is Positive");
        } else {
            System.out.println("Product is Negative");
        }
    }
}

import java.util.Scanner;
public class distwopoint {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double a1=sc.nextDouble();
    double a2=sc.nextDouble();
    double b1=sc.nextDouble();
    double b2=sc.nextDouble();
    double distance=Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
    System.out.println(distance);
}
}

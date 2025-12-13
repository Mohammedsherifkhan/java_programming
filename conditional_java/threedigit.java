import java.util.Scanner;
public class threedigit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>99){
            System.out.println("three digit num");
        }
        else{
             System.out.println("not three digit num");
        }
    }
    
}

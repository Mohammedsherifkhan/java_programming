import java .util.Scanner;
public class diffrence {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diffrence=a-b;
        if(diffrence%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}



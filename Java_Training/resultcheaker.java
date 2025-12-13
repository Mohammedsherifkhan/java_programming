import java.util.Scanner;
public class resultcheaker {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }
}

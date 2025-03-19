import java.util.Scanner;

public class Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter Integer = ");
        num=sc.nextInt();
        if(num>0){
            System.out.println("Postive Integer");
        }
        else if(num<0){
            System.out.println("Negative Integer");
        }
        else{
            System.out.println("Zero Integer");
        }
    }
}

import java.util.Scanner;

public class J1_StringVerification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = sc.next();
        System.out.println("String 1 is " + str1);
        System.out.println("Enter String 2 : ");
        String str2 = sc.next();
        System.out.println("String 2 is " + str2);
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("The Given Two Strings Are Equal.");
        }
        else{
            System.out.println("The Given Two Strings Are NOT Equal.");
        }

    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class J1_CBSE {
    public static void main(String[] args) {
        System.out.println(" CBSE Grade Card ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub1 Marks Out of 100 : ");
        int s1 = sc.nextInt();
        System.out.println("Enter Sub2 Marks Out of 100 : ");
        int s2 = sc.nextInt();
        System.out.println("Enter Sub3 Marks Out of 100 : ");
        int s3 = sc.nextInt();
        System.out.println("Enter Sub4 Marks Out of 100 : ");
        int s4 = sc.nextInt();
        System.out.println("Enter Sub5 Marks Out of 100 : ");
        int s5 = sc.nextInt();

        double P;
        P = ((s1+s2+s3+s4+s5) * 100)/500;
        System.out.println("CSBE Percenage : " + P);

    }
}

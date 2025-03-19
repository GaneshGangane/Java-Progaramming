import java.util.*;

public class J1_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int a = sc.nextInt();
        int fac = 1;

        for (int i = 1; i <=a; i++) {
            fac *= i;
        }
        System.out.println("Factorial of " + a + " is " + fac);

//        System.out.print("Enter The Number Power: ");
//        int b = sc.nextInt();
//        int result = (int)Math.min(a,b); //r = a^b
//
//        System.out.println(result);


    }
}

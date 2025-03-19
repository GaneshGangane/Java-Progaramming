import java.util.*;

public class J1_CompareString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 : ");
        String str1 = sc.next();
        System.out.println("Enter String2 : ");
        String str2 = sc.next();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings Are Equal");
        }
        else{
            System.out.println("Strings Are Not Equal");
        }

    }

}

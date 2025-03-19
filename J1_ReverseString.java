import java.util.Scanner;
public class J1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String for eg. abcd : ");
        String str = sc.next();
        String str2 = "" ;

        for(int i = str.length()-1; i>=0; i--){

            str2 += str.charAt(i);

        }
        System.out.println("Reverse String : " + str2);

    }
}

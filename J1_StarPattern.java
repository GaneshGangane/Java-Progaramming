import java.util.Scanner;
public class J1_StarPattern {

    // Normal Approach

//    static void pattern1(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }

    /*
    Recursive Approach
    Logic :
    patternRec(3)
    patternRec(2) + 3 times star and new line
    patternRec(1) + 2 times star and new line + 3 times star and new line
    patternRec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    */

    static void patternRec(int n){
        if (n>0){
            patternRec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        pattern1(n);
        patternRec(n);

    }

}

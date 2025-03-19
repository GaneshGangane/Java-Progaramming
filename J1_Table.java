import java.util.Scanner;

public class J1_Table {

    static void mul(int n){
        for (int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }

    }
    public static void main(String[] args) {
        System.out.print(" Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mul(n);

    }
}

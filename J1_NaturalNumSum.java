import java.util.Scanner;

public class J1_NaturalNumSum {

    static int sumRec(int n){
        if(n==1){
             return 1;
        }
        return n + sumRec(n-1);
    }

    static int fib(int a){
//        if (a == 1) {
//            return o;
//        } else if (a==2) {
//            return 1;
//        }


        if(a==1 ||  a==2){
            return a-1;
        }


        else{
            return fib( a- 1) + fib(a - 2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Integer For Sum of N Natural Num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = sumRec(n);
        System.out.println(n);

        System.out.print("Enter Integer Fibonacci Num: ");
        int a = sc.nextInt();
        a = fib(a);
        System.out.println(a);


    }
}

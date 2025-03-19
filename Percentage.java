import java.util.Scanner;

public class Percentage{
    
    int max = 100;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter B = ");
        int b = scanner.nextInt(); 
        System.out.println("B = " + b);
        
        System.out.print("Enter C = ");
        int c = scanner.nextInt(); 
        System.out.println("C = " + c);
        
        System.out.print("Enter D = ");
        int d = scanner.nextInt(); 
        System.out.println("D = " + d);
        
        System.out.print("Enter E = ");
        int e = scanner.nextInt(); 
        System.out.println("E = " + e);
        
        System.out.print("Enter F = ");
        int f = scanner.nextInt(); 
        System.out.println("F = " + f);
        
        
        
        double p = (b+c+d+e+f)*100/500;
        System.out.println("Percentage " + p);

    
    }
}
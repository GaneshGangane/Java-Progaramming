public class J1_Methods {

    public void area(int l,int b){
        int A;
        A = l*b;
        System.out.println("Area Of Rectangle : " + A);
    }

    public void perimeter(int l,int b){
        int P;
        P = 2*(l+b);
        System.out.println("Perimeter Of Rectangle : " + P);
    }

    public void A(int side){
        int a = side*side;
        System.out.println("Area of Square : " + a);
    }

    public void P(int side){
        int p = 4*side;
        System.out.println("Perimeter of Square : " + p);
    }

    public static void main(String[] args) {

        J1_Methods Obj = new J1_Methods();

        Obj.area(5,7);
        Obj.perimeter(5,7);

        Obj.A(5);
        Obj.P(5);

    }
}


public class J1_Array_Reverse {
    public static void main(String[] args) {
        int []arr={7,8,9,10,5};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;

        for (int i=0;i<n;i++) {
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        System.out.println(arr[4]);
    }
}

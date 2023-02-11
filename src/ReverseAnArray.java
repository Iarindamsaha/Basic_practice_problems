import java.util.Scanner;

public class ReverseAnArray {

        public static void main(String[] args) {
        ReverseAnArray obj = new ReverseAnArray();
        Scanner sc = new Scanner(System.in);
        int A[] = new int[4];
        int n = A.length;
        for(int i = 0; i <= A.length-1; i++ ){
            System.out.println("Enter The Number");
            int in = sc.nextInt();
            A[i] = in;
        }
            System.out.println(" Revered array is : ");
        for ( int i = n-1; i >= 0; i--){
            System.out.println(A[i]);
        }
    }
}

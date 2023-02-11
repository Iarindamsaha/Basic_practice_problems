import java.util.Scanner;

public class SmallestElementInArray {
    //using recursion
    public  int minimumElement(int A[] , int n){

        if (n == 1){
            return A[0];
        }
        return Math.min(A[n-1], minimumElement(A , n-1));
    }

    public static void main(String[] args) {
        SmallestElementInArray obj = new SmallestElementInArray();
        Scanner sc = new Scanner(System.in);
        int A[] = {12,3,2,90,31};//new int[5];
        int n = A.length;
        //for (int i = 0 ; i <= A.length - 1; i++){
        //    System.out.println("Enter Your input Number");
        //    int a1 = sc.nextInt();
        //    A[i] = a1;
        //}
        System.out.println("The Minimum Element is : "+ obj.minimumElement(A, n ));
    }
}

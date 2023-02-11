import java.util.Scanner;

public class StrongNumber {


    public  int factorial(int n){

        int factor = 1;


        for (int i = 1; i <= n; i++ ){

            factor = factor * i;

        }
        return factor;
    }

    public boolean result (int input) {


        int digit;
        int sum = 0;
        int temp = input;
        boolean flag = false;

        while (temp != 0){

            digit = temp % 10;

            sum = sum + factorial(digit);

            temp = temp / 10;

        }

        if (sum == input){
            flag = true;
        }
        else{
            flag = false;
        }

        return flag;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int in = sc.nextInt();

        StrongNumber obj = new StrongNumber();
        if (obj.result(in)){
            System.out.println("The Number is A Strong Number");
        }
        else {
            System.out.println("The Number is Not  A Strong Number");
        }



    }
}

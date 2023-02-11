import java.util.Scanner;

public class SumOfN_naturalNumber {

    private int number;
    private int sum = 0;

    public void setNumber(int number) {

        this.number = number;

        for (int i = 1; i <= this.number; i++){

            sum = sum+i;
        }
    }

    public int getSum() {

        return sum;

    }

    public static void main(String[] args) {

        SumOfN_naturalNumber obj = new SumOfN_naturalNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N Number : ");
        int input = sc.nextInt();
        obj.setNumber(input);
        System.out.println("The Sum of N Number is : " + obj.getSum() );

    }

}

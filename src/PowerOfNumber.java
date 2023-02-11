import java.util.Scanner;

public class PowerOfNumber {
    double number;
    double power;
    double ans;

    public void powerOf(double a, double b){

        ans = Math.pow(a,b);
        System.out.println(a + " ^ " + b + " = " + ans);

    }

    public static void main(String[] args) {
        PowerOfNumber obj = new PowerOfNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        obj.number = sc.nextDouble();
        System.out.println("Enter The Power");
        obj.power = sc.nextDouble();
        obj.powerOf(obj.number, obj.power);
    }
}

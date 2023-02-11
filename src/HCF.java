import java.util.Scanner;

public class HCF {
    int hcf = 1;
    int num1 , num2;

    public void Hcf(int a, int b){

        for (int i = 1; i <= a || i <= b ; i++){

            if( a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println("Input 1 = " + a);
        System.out.println("Input 2 =" + b);
        System.out.println("HCF is : " + hcf);

    }

    public static void main(String[] args) {

        HCF obj = new HCF();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        obj.num1 = sc.nextInt();
        System.out.println("Enter The Second Number");
        obj.num2 = sc.nextInt();
        obj.Hcf(obj.num1, obj.num2);
    }
}

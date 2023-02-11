import java.util.Scanner;

public class AutoMorphic {
    private int num;
    private int square;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public static void main(String[] args) {

        AutoMorphic obj = new AutoMorphic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        obj.setNum(sc.nextInt());
        obj.setSquare(obj.getNum() * obj.getNum());
        if (obj.calculation(obj.getNum()) == 1){
            System.out.println("The Number " + obj.getNum() + " is AutoMorphic" );
        }
        else{
            System.out.println("The Number " + obj.getNum() + " is Not AutoMorphic");
        }


    }

    public int calculation(int input) {

        int square = input * input;
        int set1;
        while (input != 0) {
            if (input % 10 != square % 10) {

                return 0;

            }

            input = input / 10;
            square = square / 10;

        }
        return 1;
    }
}

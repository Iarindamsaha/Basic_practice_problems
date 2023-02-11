import java.util.Scanner;

interface ASCII {
    String i = "The ASCII Value is = ";
    void result();
}

public class ASCIIValue implements ASCII{

    @Override
    public void result() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char input =sc.next().charAt(0);
        int output = input;
        System.out.println(i+output);
    }

    public static void main(String[] args) {
        ASCIIValue obj = new ASCIIValue();
        obj.result();
    }
}

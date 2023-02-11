import java.util.Scanner;

public class ReplaceVowels {
    String in;
    String s1 ="";

    public void replace(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        in = sc.nextLine();
        s1 = in.replaceAll("[aeiou]","");
        System.out.println("String After Vowel Removal " + s1);
    }

    public static void main(String[] args) {
        ReplaceVowels obj = new ReplaceVowels();
        obj.replace();
    }

}

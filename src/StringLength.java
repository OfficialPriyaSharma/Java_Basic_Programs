import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        String str;
        int length;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the string : ");
        str = scan.nextLine();
        System.out.println(" Length of string : " + str.length());
    }
}

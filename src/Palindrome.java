import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        String str2 = str;
        String reverse = "";
        int length = str.length();
        for(int i=length-1; i>=0; i--)
            reverse = reverse + str.charAt(i);
        if(str2.equals(reverse))
            System.out.println(" The string you enter " + str2 + " is palindrome ");
        else
            System.out.println(" The string you enter " + str2 + " not palindrome ") ;
    }
}

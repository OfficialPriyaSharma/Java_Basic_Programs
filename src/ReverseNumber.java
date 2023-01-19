import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int num, rem, rev;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number you want to reverse : ");
        num = scan.nextInt();
        for(rev = 0; num!=0; num = num/10)
        {
            rem = num % 10;
            rev = (rev * 10) + rem;
        }
        System.out.println(" The reverse of number is " + rev);
    }
}

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {

        int num, digit, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        num = scan.nextInt();
        while(num!=0)
        {
            digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println(" Sum of digit : " +sum);
    }
}



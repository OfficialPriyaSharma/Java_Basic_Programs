import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.println(" Enter the second number : ");
        int num2 = scan.nextInt();
        System.out.println(" Before Swapping ");
        System.out.println(" The first number " + num1);
        System.out.println(" The second number " + num2);
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.println(" After Swapping : ");
        System.out.println(" The first number : " + num1);
        System.out.println(" Tthe second number : " + num2);
    }
}

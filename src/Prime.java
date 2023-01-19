import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        int num, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        num = scan.nextInt();
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println(" The number you enter is prime ");
        else
            System.out.println(" The number you enter is not prime ");
    }
}

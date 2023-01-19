import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the 10 numbers for the array : ");
        for(int i = 0; i < 10; i++)
            arr[i] = scan.nextInt();

        int countEven = 0, countOdd = 0;
        for(int i = 0; i < 10; i++)
        {
            if(arr[i]%2 == 0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println(" Total even : " +countEven);
        System.out.println(" Total odd : " +countOdd);
    }
}

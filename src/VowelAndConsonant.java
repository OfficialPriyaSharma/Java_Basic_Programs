import java.util.Scanner;

public class VowelAndConsonant {

    public static void main(String[] args) {

        int len, vowel = 0 , consonant = 0;
        String str;
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the string : ");
        str = scan.nextLine();
        len = str.length();
        for(int i = 0; i < len; i++)
        {
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel++;
            else
                consonant++;
        }
        System.out.println(" Total vowels : " +vowel);
        System.out.println(" Total consonant : " +consonant);
    }
}

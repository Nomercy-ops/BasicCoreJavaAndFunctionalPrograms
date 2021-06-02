import java.util.Scanner;
public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e'|| ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u'|| ch == 'U' || ch == ' ')
        {
            System.out.println("Given character is Vowel");
        }
        else {
            System.out.println("Given character is Consonant");

        }

    }

}

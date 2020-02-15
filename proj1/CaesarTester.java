
/**
 * Write a description of class CaesarTester here.
 *
 * @author Joyce
 * @version 12/13/19
 */
import java.util.Scanner;
public class CaesarTester
{
    public static void menu()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome! Press [E] for Encrypting or [D] for Decrypting a message,or [Q] to quit.");
        String choice = in.nextLine();

        if(choice.equalsIgnoreCase("E"))
        {
            System.out.println("Please enter a message to encrypt (no punctuation): ");
            String userInput = in.nextLine();
            System.out.println();
            System.out.println("What shift would you like? (enter an integer): ");
            String shift = in.nextLine();
            int intshift = Integer.parseInt(shift.trim());
            Encryption e1 = new Encryption( userInput, intshift);
            e1.caesarEncryption();
            e1.printFinalEncryptedMsg();
            e1.emptyMsg();
            System.out.println();
            menu();
        }
        else if(choice.equalsIgnoreCase("D"))
        {
            System.out.println("Please enter a message to decrypt (no punctuation): ");
            String userInput = in.nextLine();
            System.out.println();
            System.out.println("Please enter the shift key used: ");
            String shift = in.nextLine();
            int intshift = Integer.parseInt(shift.trim());
            Decryption d1 = new Decryption( userInput, intshift);
            d1.caesarDecryption();
            d1.printFinalDecryptedMsg();
            d1.emptyMsg();
            System.out.println();
            menu();
        }
        else if(choice.equalsIgnoreCase("Q"))
        {
            System.out.println("Thank you for using the Caesar Shift Machine. Terminating now...");
        }
        else
        {
            System.out.println();
            System.out.println("Something went wrong! Please only enter [E,D,Q] as options. Try again: ");

            menu();

        }

    }
    public static void main (String [] args)
    {
        System.out.println();
        System.out.println("Caesar Shift Machine");
        System.out.println();
        menu();
    }
}
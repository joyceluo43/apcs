
/**
 * Decrypting Caesar shifts.
 *
 * @author Joyce Luo
 * @version 12/12/19
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Decryption
{
    private String userInput;
    private int shift;
    private  static ArrayList<Character> alphabet = new ArrayList<Character> ();
    private  ArrayList<Character> finalMsg = new ArrayList<Character> ();

    public  int getShift()
    {
        return shift;
    }

    public void emptyMsg() {
        finalMsg.clear();
    }

    public Decryption( String msg, int s)
    {
        userInput = msg;
        shift = s;
        AlphabetInitializer();
    }

    public void AlphabetInitializer()
    {
        for(int i = 97; i < 123; i++)
        {
            char letter = (char) i;
            alphabet.add(letter);
        }
    }

    public void caesarDecryption()
    {
        userInput = userInput.trim();
        char [] msgInput = userInput.toCharArray();
        for(int i = 0; i < msgInput.length; i++)
        {

                if (msgInput[i] == ' ') {
                finalMsg.add(msgInput[i]);
            } else {
                int decrypt = (int) msgInput[i];
                decrypt -= shift;

                while(decrypt>122) {
                    decrypt -= 26;
                }
                while(decrypt<97) {
                    decrypt += 26;
                }
                char letter = (char)decrypt;
                finalMsg.add(letter);
            }
    }}


    public void printFinalDecryptedMsg()
    {
        System.out.print("Your decrypted message is: ");
        for( int i = 0; i < finalMsg.size(); i++)
        {
            System.out.print(finalMsg.get(i));
        }
        System.out.println();
        System.out.println("The shift used was: " + getShift());
    }
}

/**
 * Encryption using a Casesar Shift cipher
 *
 * @author Joyce Luo
 * @version 12/12/19
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Encryption
{
    
        private String userInput;
        private int shift;
        private static ArrayList<Character> alphabet = new ArrayList<Character> ();
        private ArrayList<Character> finalMsg = new ArrayList<Character> ();

        public int getShift()
        {
            return shift;
        }

        public void emptyMsg() {
            finalMsg.clear();
        }

        public Encryption( String msg, int s)
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

        public void caesarEncryption()
        {
            userInput = userInput.trim();
            char [] msgInput = userInput.toCharArray();
            for(int i = 0; i < msgInput.length; i++)
            {
               if (msgInput[i] == ' ')
                {
                    finalMsg.add(msgInput[i]);
                }
                else
                {
                    int encrypt = (int)msgInput[i];
                    encrypt += shift;

                    while(encrypt>122) {
                        encrypt -= 26;
                    }
                    while(encrypt<97) {
                        encrypt += 26;
                    }
                    char letter = (char)encrypt;
                    finalMsg.add(letter);
            }}
        }

        public void printFinalEncryptedMsg()
        {
            System.out.print("Your encrypted message is: ");

            for( int i = 0; i < finalMsg.size(); i++)
            {
                System.out.print(finalMsg.get(i));
            }
            System.out.println();
            System.out.println("The shift used was: " + getShift());
        }
}
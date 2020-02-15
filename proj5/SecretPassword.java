
/**
 *
 *
 *Author @Joyce Luo
 *Date @ 7/23/19
 */
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
public class SecretPassword 

{
    public static void main(String[] args) throws IOException
    {
        //initialize stuff
        Scanner in = new Scanner(System.in);
        File newPasswords = new File("Passwords.txt");
        PrintWriter outFile = new PrintWriter(newPasswords); 
        
        //declare and initialize variables
        int userChoice = 0;
        int pwLength = 0;
        String password = "";
        double randomVal = 0;


        //password generator menu
        System.out.println("Password Generator");
        System.out.println("==============================================================");
        System.out.println("  [1] Only lowercase Letters    ");
        System.out.println("  [2] Lowercase letters and numbers");
        System.out.println("  [3] Lowercase letters, uppercase letters and numbers");             
        System.out.println("  [4] Symbols, lowercase letters, uppercase letters and numbers");       
        System.out.println("  [5] Quit                      ");
        System.out.println("==============================================================");
     
        //Prompt for a menu selection
        System.out.println();
        System.out.println("Please select an option for your password generation: ");
        userChoice = in.nextInt();
         
        //Check that selection meets the criteria of 1-4
        if(userChoice > 5 || userChoice == 0)
        { System.out.println("Please choose a valid option shown above: ");
          userChoice = in.nextInt();
        }
        
        // When it is 5, loop ends and passwords are printed back from text file
        if(userChoice == 5) 
            
        {  System.out.println("Thank you for using the Password Generator.");
           System.out.println("The program is quitting now.");
            
        }
        
        //Ask for password length
         if(userChoice != 5)
        {System.out.println();
        System.out.println("Please choose password length (enter a number greater than 5): ");
        pwLength = in.nextInt();
        
        if(pwLength < 5)
        { System.out.println("Please choose a valid password length: ");
          pwLength = in.nextInt();
        }
        
        int count = 1;
        if(userChoice == 1)
        {
            while(count < pwLength)
            {
                randomVal =  Math.random() * 26 + 97;
                password += (char)(randomVal);
                count ++;
            }
            outFile.println(password);
        }
        else if(userChoice == 2)
        {
            while(count < pwLength)
            { 
                
                while( (randomVal <= 97 && randomVal >= 122) || (randomVal <= 48 && randomVal >= 57))
                { randomVal = Math.random() * 75 + 48;
                }
                password += (char)(randomVal);
                count ++;
            }
             outFile.println(password);
        }
        else if(userChoice == 3)
        {   while(count < pwLength)
            { 
                randomVal = Math.random() * 75 + 48;
                while( (randomVal <= 97 && randomVal >= 122) || (randomVal <= 48 && randomVal >= 57)
                    || (randomVal <= 65 && randomVal >= 90) )
                { 
                    randomVal = Math.random() * 75 + 48;
                }
                password += (char)(randomVal);
                count ++;
                
            }
            outFile.println(password);
        }
        else if(userChoice == 4)
        {   while(count < pwLength)
            { 
                randomVal = Math.random() * 75 + 48;
                while( randomVal <= 48 && randomVal >= 126)
                { 
                    randomVal = Math.random() * 75 + 48;
                }
                
                password += (char)(randomVal);
                count ++;
                
            }
            outFile.println(password);
        }
        outFile.close();
        
        if( userChoice < 5)
        {   System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Thank you for using the Password Generator.");
            System.out.println();
            System.out.println("Your password is: " + password);
        } 
    }
        
     }
}
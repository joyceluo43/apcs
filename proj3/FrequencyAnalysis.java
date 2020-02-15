
/**
 * Calculate the frequency of letters in text files.
 *
 * @author Joyce Luo
 * @version 1/2/20
 */
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
public class FrequencyAnalysis
{
    static ArrayList<Character> alphabet = new ArrayList<Character>();
    ArrayList<Integer> count = new ArrayList<Integer>();
    int totalCount = 0;
    
      /**
       * stores the alphabet into array list format
       */
    public static void AlphabetInitializer()
    {
        for( int i = 97; i <= 122; i++)
        {
            char letter = (char)i;
            alphabet.add(letter);
        }
    }
    
    /**
       * calculates and stores the total frequency counts of the letters
       */
    public void frequencyCalc(File current) throws IOException
    {
        Scanner in = new Scanner(current);
        int freqCount, index = 0;
        
        while( in.hasNextLine())
        {
            String words = in.nextLine();
            words = words.toLowerCase();
            for (int i = 97; i <= 122; i++) 
            {
                char letter = (char)i;
                freqCount = 0;
                for (int x = 0; x < words.length(); x++) 
                {
                    char singleLetter = words.charAt(x);
                    if (singleLetter == letter) 
                    {
                        freqCount++;
                    }
                }
                int total =+ freqCount;
                totalCount = totalCount + freqCount;
                count.add(index, total);
                index++;
            }
            
        }
        
    }
    
    /**
       * prints data to the screen and also calculates percentage occurance
       */
    public void printData()
    {
        System.out.println();
        System.out.println("Letter Frequency: ");
        for(int i = 0; i < alphabet.size(); i++) 
        {
            char letter = alphabet.get(i);
            int counter = count.get(i);
            System.out.println(letter+ ": " + counter);
        }
        int index = 0;
        System.out.println();
        System.out.println("Percentage Occurance of each letter: ");
        for (int i = 0; i < alphabet.size(); i++) 
	{
		char letter = alphabet.get(index);
		int counter = count.get(index);
		double percent = (double)counter/totalCount;
		percent = (double) percent*100; 
		System.out.printf( letter + ": " + "%.2f\n",percent);
		index++;
         }
    }   
    
    /**
       * prints results to an outfile
       */
    public void dataWriter() throws IOException
    {
        //getting name of outfile
        Scanner in = new Scanner(System.in);
        System.out.println("Please re-enter the same file name that you chose earlier: ");
        String fileName = in.next();
        int num = 0;
        while (num < fileName.length())
        {
            num++;
        }
        int length = num - 4;
        fileName = fileName.substring(0, length);
        //printing outfile
        String name = fileName + "Freq.txt";
        File results = new File(name);
        PrintWriter output = new PrintWriter(results);
        output.println("Letter\t |\t Frequency\t |\t Percentage");
	int index = 0;
	for (int i = 0; i < alphabet.size(); i++) 
	{
		char letter = alphabet.get(index);
		int counter = count.get(index);
		double percent = (double)counter/totalCount;
		percent = (double)percent*100; 
		output.print(letter + "\t |\t " + counter + "\t\t |\t ");
		output.printf("%.2f\n", percent);
		index++;
        }
	output.close();
    }
	
	
}
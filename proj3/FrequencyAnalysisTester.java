
/**
 * Calculate the frequency of letters in text files.
 *
 * @author JOyce Luo
 * @version 1/2/20
 * */
 import java.io.File;
 import java.io.IOException;
 import java.util.Scanner;
public class FrequencyAnalysisTester 
{
    public static void main (String [] args) throws IOException 
    {
        Scanner in = new Scanner(System.in);
        String fileName = "";
        System.out.println("Welcome to the Frequency Analysis Machine.");
        System.out.println();
        System.out.println("Please enter the full name of the file you would like to analyze (including .txt): ");
        fileName = in.next();
        
        FrequencyAnalysis test = new FrequencyAnalysis();
        File file = new File(fileName);
        test.AlphabetInitializer();
        test.frequencyCalc(file);
        test.dataWriter();
        test.printData();
        
    }
}
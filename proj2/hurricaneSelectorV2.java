
/**
 *@author Joyce Luo
 *@date 8/13/19
 *
 *Program description: hurricane category calculator
 *
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class hurricaneSelectorV2

{
   
    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        File results = new File("HurricaneDataResults.txt");
        PrintWriter outFile = new PrintWriter(results);
        Scanner inFile = new Scanner(fileName);
        Scanner in = new Scanner(System.in);
        
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        
        //convert wind speed from knots to miles per hour (* 5,280, /6076)
        double [] windSpeedInMPH = new double[numValues];
        index=0;
        for(double speed : windSpeeds)
        {
            double speedInMPH = ((double)(speed * 5280))/6076;
            windSpeedInMPH[index]=speedInMPH;
            index++;
        }
        
        
        
        //Saphir-Simpson Wind speed scale to determine storm category
        //Count number of each category
        int category;
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        int categoryArray [] = new int[numValues];
        for(index=0; index < windSpeedInMPH.length; index++)
        {  
          if(windSpeedInMPH[index] <= 95)
         { category = 1;
           categoryArray[index] = category;
         }
          else if(windSpeedInMPH[index] <= 110)
         { category = 2;
           categoryArray[index] = category;
         }
          else if(windSpeedInMPH[index] <= 129)
         { category = 3;
           categoryArray[index] = category;
         }
          else if(windSpeedInMPH[index] <= 156)
         { category = 4;
           categoryArray[index] = category;
         }
          else if(windSpeedInMPH[index] >= 157)
         { category = 5;
           categoryArray[index] = category;
         }
         }
        
        //user picks year range
        
        System.out.println("Welcome to the Hurricane Data processor!");
        System.out.println("Please select a year range between 1995-2015 (enter two years separated by a space): ");
        int userRange1 = in.nextInt();
        int userRange2 = in.nextInt();
        if( userRange1 < 1995 || userRange2 > 2015)
        {
            System.out.println("Error. Please select a valid year range: ");
             userRange1 = in.nextInt();
             userRange2 = in.nextInt();
        }
            
        //calculate average category, wind speed, and pressure for given range
        int indexCount1 = 0;
        index=0;
        while(years[index] <= userRange1)
        { 
            indexCount1++;
            index++;
        }
        
        int indexCount2 = 0;
        index=0;
        while(years[index] <= userRange2)
        {
            indexCount2++;
            index++;
        }
        
        double totalWindSpeed = 0;
        index=0;
        for(index=indexCount1; index<=indexCount2; index++)
        {
            totalWindSpeed += windSpeedInMPH[index];
           if(windSpeedInMPH[index] <= 95)
           { 
           cat1 ++;
           }
          else if(windSpeedInMPH[index] <= 110)
          { 
           cat2++;
          }
          else if(windSpeedInMPH[index] <= 129)
          { 
           cat3++;
          }
          else if(windSpeedInMPH[index] <= 156)
          { 
           cat4++;
          }
          else if(windSpeedInMPH[index] >= 157)
          { 
           cat5++;
          }
          
        }
        
        double totalPressure = 0;
        index=0;
        for(index=indexCount1; index<=indexCount2; index++)
        {
            totalPressure += pressures[index];
        }
        
        int totalCategory = 0;
        index=0;
        for(index=indexCount1; index<=indexCount2; index++)
        {
            totalCategory += categoryArray[index];
        }
        
        double avgWindSpeed = totalWindSpeed / (double)(indexCount2 - indexCount1);
        double avgPressure = totalPressure / (double)(indexCount2 - indexCount1);
        double avgCategory = totalCategory / (double)(indexCount2 - indexCount1);
        
        //determine max and min values for each
        double minWind = Integer.MAX_VALUE;
        double maxWind = Integer.MIN_VALUE;
        index=0;
        int minPres = Integer.MAX_VALUE;
        int maxPres = Integer.MIN_VALUE;
        int minCat = Integer.MAX_VALUE;
        int maxCat = Integer.MIN_VALUE;

        for(index=indexCount1; index<=indexCount2; index++)
        {
            if(windSpeeds[index] < minWind){
                minWind = windSpeeds[index];
            }
            if(windSpeeds[index] > maxWind){
                maxWind = windSpeeds[index];
            }
            if(pressures[index] < minPres){
                minPres = pressures[index];
            }
            if(pressures[index] > maxPres){
                maxPres = pressures[index];
            }
            if(categoryArray[index] < minCat){
                minCat = categoryArray[index];
            }
            if(categoryArray[index] > maxCat){
                maxCat = categoryArray[index];
            }
         }
        

        
        //display formatting
        System.out.println();
        System.out.printf("%15s%5d%2s%5d\n", "Hurricanes",userRange1,"-",userRange2);
        System.out.println();
        System.out.printf("%5s%15s%15s%20s%25s\n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("====================================================================================================");
        for(index=indexCount1-1; index < indexCount2; index++){
            System.out.printf("%5s%15.13s%15d%20d%25.2f\n", years[index], names[index], categoryArray[index], pressures[index], windSpeedInMPH[index]);
        }
        System.out.println("====================================================================================================");
        System.out.print("Average: ");
        System.out.printf("%26.1f%20.2f%25.2f\n", avgCategory, avgPressure, avgWindSpeed);
        System.out.print("Maximum: ");
        System.out.printf("%26s%20s%25.2f\n", maxCat, maxPres, maxWind);
        System.out.print("Minimum: ");
        System.out.printf("%26s%20s%25.2f\n", minCat, minPres, minWind);
        System.out.println();
        outFile.println("Summary of Categories: ");
        outFile.printf("Hurricanes " + userRange1+"-"+userRange2);
        outFile.println("Number of Category 1: " + cat1);
        outFile.println("Number of Category 2: " + cat2);
        outFile.println("Number of Category 3: " + cat3);
        outFile.println("Number of Category 4: " + cat4);
        outFile.println("Number of Category 5: " + cat5);
        outFile.println();
        outFile.close();
     }
}

/**
 * Write a description of class studentDataTester here.
 *
 * @author Joyce Luo
 * @version 3/31/20
 */
public class studentDataTester
{
    public static void Main(String [] args)
    {
        studentData [] myData = new studentData[3];
        double [] s1 = { 90.00, 85.50, 74.60, 88.00,70.50};
        double [] s2 = { 95.00, 65.50, 79.00, 98.00,60.50};
        double [] s3 = {95.00, 99.50, 89.00, 68.00,100.00};
        double [] s4 = {};
        //First name excpetion
        //myData[0] = new studentData("", "Dong",s1);
        
        //last name exception
        //myData[1] = new studentData("Jessie", "",s2);
        
        //Score exception
        //myData[2] = new studentData("James", "Wang", s4);
        
        myData[0] = new studentData("Paige", "Dong",s1);
        myData[1] = new studentData("Jessie", "Luo",s2);
        myData[2] = new studentData("James", "Wang", s3);
        
        System.out.println("List of Students with Letter Grades and Test Scores");
        System.out.println("----------------------------------------------------");
        for(int i = 0; i < myData.length; i++)
        {
           System.out.println(myData[i].toString());
        }
    }
    
    
    
    
    
}

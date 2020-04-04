
/**
 * Write a description of class studentData here.
 *
 * @author Joyce Luo
 * @version 3/31/20
 */
public class studentData
{
    // instance variables - replace the example below with your own
    private String fName, lName;
    private double [] testScores;
    private String grade;

    /**
     * Constructor for objects of class studentData
     */
    public studentData(String fName, String lName, double [] testScores)
    {
        //names not empty
        if(fName.length() <= 0)
        {
            throw new IllegalArgumentException("First Name Can't Be Empty");
        }
        if(lName.length() <= 0)
        {
            throw new IllegalArgumentException("Last Name Can't Be Empty");
        }
        
        // initialise instance variables
        this.fName = fName;
        this.lName = lName;
        this.testScores = testScores;
        this.grade = calcGrade(testScores);
    }

    public String getFName()
    {
        
        return fName;
    }
     
    public String getlName()
    {
        return lName;
    }
    
    public String calcGrade(double [] testScores)
    {
        //not empty string
        if(testScores.length <= 0 )
        {
            throw new IllegalArgumentException("Test Scores Can't Be Empty");
        }
        double total = 0.0;
        for( int i = 0; i < testScores.length; i++)
        {
            total += testScores[i];
        }
        
        double grade = total/testScores.length;
        if(grade >= 90)
        {
            return "A";
        }
        else if( grade >= 80)
        {
            return "B";
        }
        else if( grade >= 70)
        {
            return "C";
        }
        else if( grade >= 60)
        {
            return "D";
        }
        else 
        {
            return "F";
        }
    }
        
    public static String printScores( double [] scores)
    {
        String str = "";
        for( double score : scores)
        {
            str += score + "  ";
        }
        return str;
    }
    
    public void setfName( String fName)
    {
        this.fName = fName;
    }
    
    public void setlName( String lName)
    {
        this.lName = lName;
    }
    
    public void setTestScores( double[] testScores)
    {
        this.testScores = testScores;
    }
    
    public void setGrade( String grade)
    {
        this.grade = grade;
    }
    
    public String toString()
    {
        return fName + "\t" + lName + "| \t " +  grade + ":  " +  printScores(testScores);
        
    }
    
}


/**
 * Write a description of class testStudent here.
 *
 * @author Joyce Luo
 * @version 3/22/20
 */
import java.util.ArrayList;
import java.util.List;
public class testStudent
{
    public static void main(String [] args)
    {
        List<student> myGrade = new ArrayList<student>();
        myGrade.add(new student("Kareena Wu", 70, 82, 65, 120, 100));
        myGrade.add(new student("James Wang", 93, 95, 91, 124, 100));
        myGrade.add(new student("Kevin Mao", 50, 79, 100, 99, 100));
        myGrade.add(new student("Ellary Lin", 89, 90, 95, 98, 89));
        myGrade.add(new student("Anthony Weng", 70, 70, 90, 70, 80));
        System.out.println("Welcome to the Gradebook:");
        System.out.println();
        printResults(myGrade);
        System.out.println();
        System.out.println("Changing Kareena's name to uwaneerak:");
        replaceName(myGrade, "Kareena Wu", "uwaneerak");
        System.out.println();
        printResults(myGrade);
        System.out.println();
        System.out.println("Replacing Anthony with Winston Tang");
        replaceStudent(myGrade, "Anthony Weng", "Winston Tang", 80, 72, 63, 70, 90);
        System.out.println();
        printResults(myGrade);
        System.out.println();
        System.out.println("Changing James's Quiz 1 score to 80:");
        replaceQuiz(myGrade, "James Wang", 1, 80);
        System.out.println();
        printResults(myGrade);
        System.out.println();
        System.out.println("Inserting Lily Yang");
        insertStudent(myGrade, "Kevin Mao", "Lily Yang",95, 95, 90, 100, 100);
        System.out.println();
        printResults(myGrade);
        System.out.println();
        System.out.println("Deleting James:");
        delete(myGrade, "James Wang");
        System.out.println();
        printResults(myGrade);
    }

    public static void printResults(List<student> gradebook) 
    {
        System.out.println("Student Name \t\t  Q1  \t   Q2 \t   Q3  \t   Q4 \t Q5");
        System.out.println("-----------------------------------------------------------------------");
        for (student x : gradebook) 
        {
           System.out.println(x);
        }
    }

     public static void delete(List<student> gradebook, String findName) 
    {
        for (int i = 0; i < gradebook.size(); i++) 
        {
            if (gradebook.get(i).getName().equals(findName)) 
            {
                gradebook.remove(i);
                break;
            }
        }
    }
    
    public static void replaceName(List<student> gradebook, String findName, String replaceName) 
    {
        for (int i = 0; i < gradebook.size(); i++) 
        {
            if (gradebook.get(i).getName().equals(findName)) 
            {
                gradebook.get(i).setName(replaceName);
                break;
            }
        }
        
    }

    public static void replaceQuiz(List<student> gradebook, String findName, 
        int num, int score) 
    {
        for (int i = 0; i < gradebook.size(); i++) 
        {
            if (gradebook.get(i).getName().equals(findName)) 
            {
                gradebook.get(i).setQuiz(num, score);
                break;
            }
        }
    }

    public static void replaceStudent(List<student> gradebook, String findName, 
        String replaceName, int q1, int q2, int q3, int q4, int q5) 
    {
        for (int i = 0; i < gradebook.size(); i++) 
        {
            if (gradebook.get(i).getName().equals(findName)) 
            {
                gradebook.get(i).setName(replaceName);
                gradebook.get(i).setQuiz(1, q1);
                gradebook.get(i).setQuiz(2, q2);
                gradebook.get(i).setQuiz(3, q3);
                gradebook.get(i).setQuiz(4, q4);
                gradebook.get(i).setQuiz(5, q5);
                break;
            }
        }
    }

    public static void insertStudent(List<student> gradebook, String beforeName, 
        String insertName, int q1, int q2, int q3, int q4, int q5) 
        {
        for (int i = 0; i < gradebook.size(); i++) 
        {
            if (gradebook.get(i).getName().equals(beforeName)) 
            {
                gradebook.add(i, new student(insertName, q1, q2, q3, q4, q5));
                break;
            }
        }
    }

   
}


/**
 * Write a description of class student here.
 *
 * @author Joyce Luo
 * @version 3/22/20
 */
public class student
{
    private String name;
    private int q1,q2,q3,q4,q5;
    
    public student(String name, int q1, int q2, int q3, int q4, int q5) 
    {
        this.name = name;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }

    public int getQuiz(int num) 
    {
        if (num == 1)
            return this.q1;
        else if (num == 2)
            return this.q2;
        else if (num == 3)
            return this.q3;
        else if (num == 4)
            return this.q4;
        else if (num == 5)
            return this.q5;
        else
            return -1;
    }

    public void setQuiz(int num, int score) 
    {
        if (num == 1)
            this.q1 = score;
        else if (num == 2)
            this.q2 = score;
        else if (num == 3)
            this.q3 = score;
        else if (num == 4)
            this.q4 = score;
        else if (num == 5)
            this.q5 = score;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
    public String getName() 
    {
        return this.name;
    }

    public String toString() 
    {
        System.out.printf("%-18s%10d%10d%10d%10d%10d", 
            this.name + ":", this.q1, this.q2, this.q3, this.q4, this.q5);
        return "";
    }
}



/**
 * Calculate the nth Fibonacci number using a recursive sequence.
 *
 * @author Joyce Luo
 * @version 11/11/19
 */
import java.util.Scanner;
public class fibonacciCalc
{
    public static int fibonacciNum(int n)
    {
        
        if(n == 0)
        return 0;
        else if(n == 1 || n == 2)
        return 1;
        else
        return fibonacciNum(n-1)+fibonacciNum(n-2);
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("            Welcome to the Fibonacci Number Calculator");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please enter an integer n to calculate the nth Fibonacci number: ");
        int n = in.nextInt();
        
        
        if(n % 1 != 0) 
        {
            System.out.println("Please enter an integer only. Try again: ");
            n = in.nextInt();
        }
        else if( n > 40)
        {
            System.out.println("Your number is too large. Try again: ");
            n = in.nextInt();
        }
        
        System.out.println(fibonacciNum(n));
            
        
    }
    
}

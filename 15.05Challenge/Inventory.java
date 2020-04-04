
/**
 * Write a description of class Inventory here.
 *
 * @author Joyce
 * @version 3/8/20
 */
import java.util.ArrayList;

public class Inventory
{
    public static ArrayList<Product> p1 = new ArrayList<Product>();
    
    public static void main(String [] args)
    {
        Boot b1 = new Boot("Jackson Freestyle", 200.00);
        Boot b2 = new Boot(" Edea Ice Flys", 650.00);
        Boot b3 = new Boot(" Jackson Premeire", 330.00);
        Boot b4 = new Boot(" Edea Ice Flys", 700.00);
        Blade a1 = new Blade("Coronation Ace", 209.00);
        Blade a2 = new Blade("Pattern 99", 500.00);
        Blade a3 = new Blade("Coronation Ace", 400.00);
        Tool t1 = new Tool("Rockerz", 35.00);
        Tool t2 = new Tool("Mondor", 45.00);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(a1);
        p1.add(a2);
        p1.add(a3);
        p1.add(t1);
        p1.add(t2);
        
        System.out.println();
        System.out.println("        Figure Skating Equipment Inventory");
        System.out.println("-----------------------------------------------");
        takeInventory(" Edea Ice Flys");
        takeInventory("Rockerz");
        takeInventory("Jackson Freestyle");
        takeInventory("Coronation Ace");
        
        System.out.println();
        System.out.println();
        System.out.println("Comparing the Figure Skating Accessories");
        System.out.println("----------------------------------------------");
        if(t1.compareTo(t2) == -1)
        {
            System.out.println("The second figure skating accessory is more expensive.");
        }
        else if(t1.compareTo(t2) == 0)
        {
            System.out.println("The two figure skating accessories are the same price.");
        }
        else
        {
            System.out.println("The first figure skating accessory is more expensive.");
        }
           
    }  
    
    public static void takeInventory(String kind)
    {
        int items = 0;
        double totalPrice = 0.00;
        ArrayList <Tool> tool = new ArrayList<Tool>();
        for(Product x : p1)
        {
            if( x.getKind().equalsIgnoreCase(kind))
            {
                items++;
                totalPrice = totalPrice + x.getPrice();
            }
        }
        System.out.println(kind + "- Quantity: " + items + ", Total Price: $" + totalPrice);
    
    }
     
    
}

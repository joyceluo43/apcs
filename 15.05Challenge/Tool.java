
/**
 * Write a description of class CompareTool here.
 *
 * @author Joyce
 * @version 3/8/20
 */
public class Tool implements Product, Comparable<Tool>
{
    private String kind;
    private double price;
    
    public Tool(String kind, double price)
    {
        this.kind = kind;
        this.price = price;
    }
    
    public String getKind()
    {
        return kind;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int compareTo(Tool obj)
    {
        if(price < obj.price)
        {
            return -1;
        }
        else if(price == obj.price)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}


/**
 * Write a description of class Skate here.
 *
 * @author Joyce Luo
 * @version 3/8/20
 */
public abstract class Skate implements Product
{
    private String kind;
    private double price;
    
    public Skate( String kind, double price)
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
    
    
}

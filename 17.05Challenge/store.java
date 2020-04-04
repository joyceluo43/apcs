
/**
 * Write a description of class store here.
 *
 * @author Joyce Luo
 * @version 3/25/20
 */
public class store
{
    private String name;
    private int pNum;
    private double price;
    private int quantity;
    
    public store( String name, int pNum, double price, int quantity)
    {
        this.name = name;
        this.pNum = pNum;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPNum()
    {
        return pNum;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        String string = String.format( name + "\t" + pNum + "\t" + "$" +price+ "\t" +quantity);
        return string;
    }
}

 /**
 * Write a description of class storeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class storeTester
{
    public static void main(String [] args)
    {
        store [] items = new store[10];
        store [] sorted = new store[10];
        items[0] = new store("Eyeliner", 32, 22.90, 56);
        items[1] = new store("Eyeshadow",44, 56.50, 21);
        items[2] = new store("Foundation",8, 24.00, 60);
        items[3] = new store("Concealer", 7, 18.00, 45);
        items[4] = new store("Primer   ", 10, 34.99, 13);
        items[5] = new store("Bronzer  ", 19, 12.00, 39);
        items[6] = new store("Brow tint", 46, 20.00, 24);
        items[7] = new store("Highlight", 23, 17.60, 30);
        items[8] = new store("Eyelashes", 66, 15.00, 100);
        items[9] = new store("Blush    ", 18, 10.50, 52);
        
        System.out.println("Makeup Store Inventory Before Sorting");
        System.out.println("Name \t Item Number \t Price \t Quantity");
        System.out.println("--------------------------------------------");
        printItem(items);
        System.out.println();
        System.out.println("Sorted by Item Name in Descending Order");
         System.out.println("Name \t Item Number \t Price \t Quantity");
        System.out.println("--------------------------------------------");
        items = sortName( items, 2);
        printItem(items);
        System.out.println();
        System.out.println("Sorted by Product Number in Descending Order");
        System.out.println("Name \t Item Number \t Price \t Quantity");
        System.out.println("--------------------------------------------");
        sortPNum( items, 0,9);
        printItem(items);
        System.out.println();
        System.out.println("Sorted by Item Price in Ascending Order");
        System.out.println("Name \t Item Number \t Price \t Quantity");
        System.out.println("--------------------------------------------");
        sorted = sortPrice( items, 1);
        printItem(sorted);
        System.out.println();
        System.out.println("Sorted by Item Quantity in Descending Order");
        System.out.println("Name \t Item Number \t Price \t Quantity");
        System.out.println("--------------------------------------------");
        sorted = sortQuantity( items, 2);
        printItem(sorted);
        System.out.println();
    }
    
    public static void printItem(store[] items)
    {
        for(int i = 0; i < items.length; i++)
        {
            System.out.println( items[i].toString());
        }
    }
    
    //selection sort
    public static store [] sortName( store[] items, int order)
    {
        int i;
        int k;
        int posMax;
        store temp;
        if(order == 1)
        {
            for (i = items.length-1; i >=0; i--)
            {
                posMax = 0;
                for(k = 0; k <= i; k++)
                {
                    if(items[k].getName().compareTo(items[posMax].getName()) > 0)
                    {
                        posMax = k;
                    }
                }
                temp = items[i];
                items[i] = items[posMax];
                items[posMax] = temp;
            }
            return items;
        }
            else if( order == 2)
            {
                 for (i = items.length-1; i >=0; i--)
            {
                posMax = 0;
                for(k = 0; k <= i; k++)
                {
                    if(items[k].getName().compareTo(items[posMax].getName()) < 0)
                    {
                        posMax = k;
                    }
                }
                temp = items[i];
                items[i] = items[posMax];
                items[posMax] = temp;
            }
            return items;
        }
        else
        {
            return items;
        }
    }
    
    //merge sort
    public static void sortPNum ( store[] items, int low, int high)
    {
        if( low == high)
        {
            return;
        }
        int mid = (low+high)/2;
        sortPNum( items, low, mid);
        sortPNum( items, mid+1, high);
        mergePNum( items, low, mid, high);
    }
    
    public static void mergePNum( store [] items, int low, int mid, int high)
    {
        store [] temp = new store[ high - low + 1];
        int i = low;
        int j = mid+1;
        int n = 0;
        while( i <= mid || j <= high)
        {
            if ( i > mid)
            { temp[n] = items[j];
              j++;
            }
            else if ( j> high)
            {
                temp[n] = items[i];
                i++;
            }
            else if(items[i].getPNum() > items[j].getPNum())
            {
                temp[n] = items[i];
                i++;
            }
            else
            {
                temp[n] = items[j];
                j++;
            }
            n++;
        }
        for( int k = low; k <= high; k++)
        {
            items[k] = temp[k-low];
        }
    }
    
    //insertion sort
    public static store [] sortPrice( store [] items, int order)
    {
        store [] sorted = new store[10];
        if( order == 1)
        {
            for( int i = 0; i < items.length; i++)
            {
                store next = items[i];
                int index = 0;
                int k = i;
                while( k > 0 && index == 0)
                {
                    if(next.getPrice() > sorted[k-1].getPrice())
                    {
                        index = k;
                    }
                    else
                    {
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[index] = next;
            }
            return sorted;
        }
        else if( order == 2)
        {
            for( int i = 0; i < items.length; i++)
            {
                store next = items[i];
                int index = 0;
                int k = i;
                while( k > 0 && index == 0)
                {
                    if(next.getPrice() < sorted[k-1].getPrice())
                    {
                        index = k;
                    }
                    else
                    {
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[index] = next;
            }
            return sorted;
        }
        else
        {
            return sorted;
        }
    }
    
    public static store [] sortQuantity( store [] items, int order)
    {
        store [] sorted = new store[10];
        if( order == 1)
        {
            for( int i = 0; i < items.length; i++)
            {
                store next = items[i];
                int index = 0;
                int k = i;
                while( k > 0 && index == 0)
                {
                    if(next.getQuantity() > sorted[k-1].getQuantity())
                    {
                        index = k;
                    }
                    else
                    {
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[index] = next;
            }
            return sorted;
        }
        else if( order == 2)
        {
            for( int i = 0; i < items.length; i++)
            {
                store next = items[i];
                int index = 0;
                int k = i;
                while( k > 0 && index == 0)
                {
                    if(next.getQuantity() < sorted[k-1].getQuantity())
                    {
                        index = k;
                    }
                    else
                    {
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[index] = next;
            }
            return sorted;
        }
        else
        {
            return sorted;
        }
    }
         
    
    
    
    
    
    
}
    
    
    
    
    


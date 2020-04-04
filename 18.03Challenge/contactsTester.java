
/**
 * Write a description of class contactstester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class contactsTester
{
    public static void main(String [] args)
    {
        contacts [] myList = new contacts[10];
        contacts [] sorted = new contacts[10];
        myList[0] = new contacts("Paige Dong", "Friend","Jun 27","510-789-8485", "paigewdong@gmail.com");
        myList[1] = new contacts("Huitao Luo", "Dad", "Feb 2", "510-335-9169", "hluo32@gmail.com");
        myList[2] = new contacts("Huizhuo Liu", "Mom", "Jun 23", "510-338-8251", "amyliu32@gmail.com");
        myList[3] = new contacts("Jessie Luo", "Roomie", "Aug 3", "510-668-0875", "jessieluo@gmail.com");
        myList[4] = new contacts("Grace Yan", "Friend", "Aug 29", "510-222-3094", "gracehi123@gmail.com");
        myList[5] = new contacts("Greg Chi", "Coach", "Sep 16", "408-978-2283", "gregchi@stanford.alumni.com");
        myList[6] = new contacts("Julia DiGia" , "Coach", "Mar 2", "408-234-8757", "jdigiallorenzo@gmail.com");
        myList[7] = new contacts("Stephanie Yang", "Coach", "Aug 24", "216-384-4983", "syang@gmail.com");
        myList[8] = new contacts("Charlotte Suh", "Roomie", "May 24", "284-094-9483", "csuh@gmail.com");
        myList[9] = new contacts("Jennie Kim", "Friend", "Nov 12", "993-093-4564", "jenniekim@gmail.com");
        
        System.out.println(" \t Original Contacts List");
        System.out.println("Name \t\tRelation  Birthday   Phone # \t Email");
        System.out.println("-----------------------------------------------------------------------");
        printResults(myList);
        System.out.println();
        
        System.out.println("Searching for Charlotte Suh");
        sorted = sortName(myList);
        binarySearchName( sorted, "Charlotte Suh");
        System.out.println();
        System.out.println("Searching for Lalalisa");
        binarySearchName( sorted, "Lalalisa");
        System.out.println();
        
        System.out.println("Searching for Friends");
        sorted = sortRelation(myList);
        binarySearchRelation( sorted, "Friend");
        System.out.println();
        System.out.println("Searching for Cousins");
        binarySearchRelation( sorted, "cousins");
        System.out.println();
        
        System.out.println("Searching for August Babies");
        sorted = sortBday(myList);
        binarySearchBday( sorted, "Aug");
        System.out.println();
        System.out.println("Searching for January Babies");
        binarySearchBday( sorted, "Jan");
        System.out.println();
        
        System.out.println("Searching for #510-338-8251 ");
        sorted = sortPhoneNum(myList);
        binarySearchPhoneNum( sorted, "510-338-8251");
        System.out.println();
        System.out.println("Searching for #510-396-1142");
        binarySearchPhoneNum( sorted, "510-396-1142");
        System.out.println();
        
        System.out.println("Searching for gregchi@stanford.alumni.com ");
        sorted = sortEmail(myList);
        binarySearchEmail( sorted, "gregchi@stanford.alumni.com");
        System.out.println();
        System.out.println("Searching for playground@gmail.com");
        binarySearchEmail( sorted, "playground@gmail.com");
        System.out.println();
    }
    
    
    public static void printResults(contacts [] myList)
    {
        for(int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i]);
        }
    }
    
    public static contacts[]  sortName( contacts [] myList)
    {
        contacts[] sorted = new contacts[10];
        for(int i = 0; i < myList.length; i++)
        {
            contacts next = myList[i];
            int index = 0;
            int k = i;
            while( k > 0 && index == 0)
            {
                if(next.getName().compareTo(sorted[k-1].getName()) > 0 )
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
    
    public static contacts[]  sortRelation( contacts [] myList)
    {
        contacts[] sorted = new contacts[10];
        for(int i = 0; i < myList.length; i++)
        {
            contacts next = myList[i];
            int index = 0;
            int k = i;
            while( k > 0 && index == 0)
            {
                if(next.getRelation().compareTo(sorted[k-1].getRelation()) > 0 )
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
    
    public static contacts[]  sortBday( contacts [] myList)
    {
        contacts[] sorted = new contacts[10];
        for(int i = 0; i < myList.length; i++)
        {
            contacts next = myList[i];
            int index = 0;
            int k = i;
            while( k > 0 && index == 0)
            {
                if(next.getBday().compareTo(sorted[k-1].getBday()) > 0 )
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
    
    public static contacts[]  sortPhoneNum( contacts [] myList)
    {
        contacts[] sorted = new contacts[10];
        for(int i = 0; i < myList.length; i++)
        {
            contacts next = myList[i];
            int index = 0;
            int k = i;
            while( k > 0 && index == 0)
            {
                if(next.getPhoneNum().compareTo(sorted[k-1].getPhoneNum()) > 0 )
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
    
    public static contacts[]  sortEmail( contacts [] myList)
    {
        contacts[] sorted = new contacts[10];
        for(int i = 0; i < myList.length; i++)
        {
            contacts next = myList[i];
            int index = 0;
            int k = i;
            while( k > 0 && index == 0)
            {
                if(next.getEmail().compareTo(sorted[k-1].getEmail()) > 0 )
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
    
    
    public static void binarySearchName( contacts [] sorted, String toFind)
    {
        int high = sorted.length;
        int low = -1;
        int probe;
        while( high - low > 1)
        {
            probe = (high + low)/2;
            if(sorted[probe].getName().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if( sorted[probe].getName().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        if( (low >= 0) && (sorted[low].getName().compareTo(toFind) == 0))
        {
            System.out.println("We have found " + toFind + " in your list!");
            System.out.println("Name \t\tRelation  Birthday   Phone # \t Email");
            System.out.println("-----------------------------------------------------------------------");
            linearPrintName(sorted, low, toFind);
        }
        else
        {
            System.out.println("Sorry, the person " + toFind + " is not in your list.");
        }
            
    }
    
    public static void linearPrintName( contacts [] sorted, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;
        
        //find starting point of matches
        i = low - 1;
        while( (i>=0) && (sorted[i].getName().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        
        //ending point of matches
        i = low + 1;
        while( ( i < sorted.length) && (sorted[i].getName().compareTo(toFind) == 0 ))
        {
            end = i;
            i++;
        }
        
        //print
        for( i = start; i <= end; i++)
        {
            System.out.println(sorted[i]);
        }
    }
    
    public static void binarySearchRelation( contacts [] sorted, String toFind)
    {
        int high = sorted.length;
        int low = -1;
        int probe;
        int found = 0;
        while( high - low > 1)
        {
            probe = (high + low)/2;
            if(sorted[probe].getRelation().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if( sorted[probe].getRelation().compareTo(toFind) == 0)
                {
                    
                    break;
                }
            }
           
        }
        if( (low >= 0) && (sorted[low].getRelation().compareTo(toFind) == 0))
        {
            
            linearPrintRelation(sorted, low, toFind);
        }
        else
        {
            System.out.println("Sorry, " + toFind + "(s) are not in your list.");
        }
            
    }
    
    public static void linearPrintRelation( contacts [] sorted, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;
        int found = 0;
        //find starting point of matches
        i = low - 1;
        while( (i>=0) && (sorted[i].getRelation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        
        //ending point of matches
        i = low + 1;
        while( ( i < sorted.length) && (sorted[i].getRelation().compareTo(toFind) == 0 ))
        {
            end = i;
            i++;
        }
        
        //print
        for( i = start; i <= end; i++)
        {
            found++;
            
            
        }
            System.out.println("We have found " +found+ " " + toFind + "(s) in your list!");
            System.out.println("Name \t\tRelation  Birthday   Phone # \t Email");
            System.out.println("-----------------------------------------------------------------------");
        for( i = start; i <= end; i++)
        {
            System.out.println(sorted[i]);
        }
          
    }
    
    public static void binarySearchPhoneNum( contacts [] sorted, String toFind)
    {
        int high = sorted.length;
        int low = -1;
        int probe;
        while( high - low > 1)
        {
            probe = (high + low)/2;
            if(sorted[probe].getPhoneNum().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if( sorted[probe].getPhoneNum().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        if( (low >= 0) && (sorted[low].getPhoneNum().compareTo(toFind) == 0))
        {
            System.out.println("We have found the phone #" + toFind + " in your list!");
            System.out.println("Name \t\tRelation  Birthday   Phone # \t Email");
            System.out.println("-----------------------------------------------------------------------");
            linearPrintPhoneNum(sorted, low, toFind);
        }
        else
        {
            System.out.println("Sorry, the person " + toFind + " is not in your list.");
        }
            
    }
    
    public static void linearPrintPhoneNum( contacts [] sorted, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;
        
        //find starting point of matches
        i = low - 1;
        while( (i>=0) && (sorted[i].getPhoneNum().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        
        //ending point of matches
        i = low + 1;
        while( ( i < sorted.length) && (sorted[i].getPhoneNum().compareTo(toFind) == 0 ))
        {
            end = i;
            i++;
        }
        
        //print
        for( i = start; i <= end; i++)
        {
            System.out.println(sorted[i]);
        }
    }
    
    public static void binarySearchEmail( contacts [] sorted, String toFind)
    {
        int high = sorted.length;
        int low = -1;
        int probe;
        while( high - low > 1)
        {
            probe = (high + low)/2;
            if(sorted[probe].getEmail().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if( sorted[probe].getEmail().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        if( (low >= 0) && (sorted[low].getEmail().compareTo(toFind) == 0))
        {
            System.out.println("We have found the email" + toFind + " in your list!");
            System.out.println("Name \t\tRelation  Birthday   Phone # \t Email"); 
            System.out.println("-----------------------------------------------------------------------");
            linearPrintName(sorted, low, toFind);
        }
        else
        {
            System.out.println("Sorry, the email " + toFind + " is not in your list.");
        }
            
    }
    
    public static void linearPrintEmail( contacts [] sorted, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;
        
        //find starting point of matches
        i = low - 1;
        while( (i>=0) && (sorted[i].getEmail().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        
        //ending point of matches
        i = low + 1;
        while( ( i < sorted.length) && (sorted[i].getEmail().compareTo(toFind) == 0 ))
        {
            end = i;
            i++;
        }
        
        //print
        for( i = start; i <= end; i++)
        {
            System.out.println(sorted[i]);
        }
    }
    
    public static void binarySearchBday( contacts [] sorted, String toFind)
    {
        int high = sorted.length;
        int low = -1;
        int probe;
        
        while( high - low > 1)
        {
            probe = (high + low)/2;
            if(sorted[probe].getMonth().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if( sorted[probe].getMonth().compareTo(toFind) == 0)
                {
                    
                    break;
                    
                }
                
            }
            
        }
        if( (low >= 0) && (sorted[low].getMonth().compareTo(toFind) == 0))
        {
            
            linearPrintBday(sorted, low, toFind);
        }
        else
        {
            System.out.println("Sorry, " + toFind + " babies are not in your list.");
        }
            
    }
    
    public static void linearPrintBday( contacts [] sorted, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;
        int found = 0;
        //find starting point of matches
        i = low - 1;
        while( (i>=0) && (sorted[i].getMonth().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        
        //ending point of matches
        i = low + 1;
        while( ( i < sorted.length) && (sorted[i].getMonth().compareTo(toFind) == 0 ))
        {
            end = i;
            i++;
        }
        
        //print
        for( i = start; i <= end; i++)
        {
            found++;
            
        }
        
        System.out.println("We have found " +found + " " + toFind + " babies in your list!");
        System.out.println("Name \t\tRelation  Birthday   Phone # \t Email");
        System.out.println("-----------------------------------------------------------------------");
         for( i = start; i <= end; i++)
        {
            
            System.out.println(sorted[i]);
        }
        
    }
}


/**
 * Write a description of class contacts here.
 *
 * @author Joyce Luo
 * @version 3/28/20
 */
public class contacts
{
    private String name, relation, bday, email, phoneNum;
    
    public contacts( String name, String relation, 
        String bday, String phoneNum, String email)
       {
            this.name = name;
            this.relation = relation;
            this.bday = bday;
            this.phoneNum = phoneNum;
            this.email = email;
        }
        
    public String getName()
    {
        return name;
    }
    
    public String getRelation()
    {
        return relation;
    }
    
    public String getBday()
    {
        return bday;
    }
    
    public String getMonth()
    {
        String month = bday.substring(0,3);
        return month;
    }
    
    public String getPhoneNum()
    {
        return phoneNum;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String toString()
    {
        String str = (name + " \t" + relation + "\t" + bday + "\t" + 
            phoneNum+ " \t" + email);
        return str;
    }
        
}

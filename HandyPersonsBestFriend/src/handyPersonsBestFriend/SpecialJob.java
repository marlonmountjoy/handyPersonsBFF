package handyPersonsBestFriend; // package declaration

public class SpecialJob extends Job // 
{
    
    private String special;  // string variable for the special field

   
    public SpecialJob(String name, double hours, String special)  // constructor for the special job class
    {
        super(name, hours); // call the super class constructor with name and hours
        this.special = special; // set the special attribute
    }

    
    public String getSpecial() // getter for the special attribute
    {
        return special;
    }

    
    public void setSpecial(String special) // setter for the special attribute
    {
        this.special = special;
    }

    @Override
    public String toString() // override the tostring method to include the special attribute in the output
    {
        return super.toString() + ", Special: " + special;
    }
}

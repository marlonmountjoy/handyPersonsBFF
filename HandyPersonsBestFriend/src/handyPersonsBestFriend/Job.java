package handyPersonsBestFriend; // package declaration

public class Job // public class that defines job
{
    private String name; // instance variables for job name and hours
    private double hours;
    
    public Job(String name, double hours) // constructor to initialize a new job with name and hours
    {
        this.name = name;
        this.hours = hours;
    }
    
    public String getName() // getter method that returns job name
    {
        return name;
    }
    
    public double getHours() // getter method that returns job hours
    {
        return hours;
    }
    
    public void setHours(double hours) // setter method that updates hours
    {
        this.hours = hours;
    }
    
    @Override // read that this was a best practice to annotate overridden methods
    public String toString() // override tostring method to display job name and hours worked
    {
        return "Job: " + name + ", Hours: " + hours; // concatenates name and hours with hard coded labels
    }
}

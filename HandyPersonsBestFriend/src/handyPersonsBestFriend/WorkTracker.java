package handyPersonsBestFriend; // package declaration

import java.util.ArrayList; // import arraylist class from java util package

public class WorkTracker // storage class 
{
    private ArrayList<Job> jobs; // instance variable to hold the list of jobs
    
    public WorkTracker() // constructor to initialize a new worktracker object with an empty list
    {
        jobs = new ArrayList<>();
    }
    
    public void addJob(Job job) // method to add a job to the job list
    {
        jobs.add(job);
    }
    
    public double getTotalHours() // getter method to calculate and return the total hours worked 
    {
        double totalHours = 0;
        for (Job job : jobs) // iterate through all the jobs in the arraylist
        {
            totalHours += job.getHours(); // adds each jobs hours to the total hours
        }
        return totalHours; // and returns the total sum after the loop has run
    }
    
    public ArrayList<Job> getJobs() // getter method that returns the arraylist of all jobs
    {
        return jobs; // return the arraylist of jobs
    }

    public Job getJob(String jobName) // getter method that finds a specific job from the list
    {								// by name
        for (Job job : jobs) // iterate over every job in the jobs arraylist
        {
            if (job.getName().equals(jobName)) // if the name of the current job matches the passed name
            {
                return job; // then return this job
            }
        }
        return null; // job not found
    }
    
    public String jobListToString() // method to create a string out of the job list
    {
        StringBuilder sb = new StringBuilder(); // instatiate a new stringbuilder object
        
        for (Job job : jobs) // iterate over all the jobs in the arraylist
        {
            sb.append(job.toString()).append("\n"); // append the string representation of the job
        }											// to the stringbuilder object followed by a new line
        return sb.toString(); // convert the stringbuilder object to a string and return it
    }
    
    public void sortJobs() 
    {
        int[] hours = new int[jobs.size()]; // dynamically create an array to store the hours worked for each job
        									
        for (int i = 0; i < jobs.size(); i++) // iterate through the array
        {
            hours[i] = (int) (jobs.get(i).getHours() * 100); // convert the hours worked to an integer
        }
        
        Sort.quickSort(hours); // use the sort class to sort the hours worked
        ArrayList<Job> sortedJobs = new ArrayList<>(); // create a new arraylist to store the sorted jobs
        
        for (int i = 0; i < hours.length; i++) 
        {
            for (Job job : jobs) // iterate through the original jobs list
            {
                if ((int) (job.getHours() * 100) == hours[i]) // find the job with matching hours
                {
                    sortedJobs.add(job); // add the job to the new job list
                    break; // move on to the next hour value
                }
            }
        }
        
        jobs = sortedJobs;  // replace the original job list with the new sorted job list
    }

}

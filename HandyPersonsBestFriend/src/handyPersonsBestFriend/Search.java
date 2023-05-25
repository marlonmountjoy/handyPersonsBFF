package handyPersonsBestFriend; // package declaration

import java.util.ArrayList; // import arraylist class from util package

public class Search // search utility class
{
    public static ArrayList<Job> searchJobs(ArrayList<Job> jobs, String searchTerm) // method that takes an arraylist 
    { // of type job and a search term and returns an arraylist with the results of the search
        ArrayList<Job> searchResults = new ArrayList<>(); // instantiate new arraylist to hold the search results
        for (Job job : jobs) // iterate through all the jobs in the arraylist
        {
            if (job.getName().toLowerCase().contains(searchTerm.toLowerCase())) // check if the jobs name contains the search term
            {																	// with out being case sensitive
                searchResults.add(job); // if the job name contains the search term add it to the search results arraylist
            }
        }
        return searchResults; // return the searchresults arraylist containing all the matches
    }
}


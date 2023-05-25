package handyPersonsBestFriend; // package declaration

import javax.swing.*; // import all of the java swing package

public class HandyPersonGUI // GUI class
{
    private WorkTracker workTracker; // declare an instance of worktracker

    public HandyPersonGUI() // constructor to initialize the instance
    {
        workTracker = new WorkTracker();
    }

    public void showMainMenu() // method to show the main menu and handle user input
    {
        String[] options = {"Add Job", "Add Special Job", "Show Jobs", "Total Hours", "Search", "Exit"}; // define menu
        int choice = 0;
        do // do while loop that checks to make sure the close dialog box button has not been clicked
        { 																// display menu and get user input
            	choice = JOptionPane.showOptionDialog(null, "Select an option:", "HandyPerson Work Tracker", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

	            switch (choice) // switch statement to handle the users inputs
	            {
	                case 0:
	                    addJob();
	                    break;
	                case 1:
	                    addSpecialJob();
	                    break;
	                case 2:
	                    showJobs();
	                    break;
	                case 3:
	                    showTotalHours();
	                    break;
	                case 4:
	                    searchJobs();
	                    break;
	                case 5:
	                case JOptionPane.CLOSED_OPTION: // x button was clicked
	                    System.exit(0); // call exit method of system class
	                    break;
	                default:
	                    break;
	            }
	        } 
        
	        while (choice != JOptionPane.CLOSED_OPTION); // while the x button has not been clicked keep doing
    }


    private void addJob() // method to add a new job to the worktracker
    {
        String name = JOptionPane.showInputDialog("Enter job name:"); // get job name from user
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:")); // get hours from user
        workTracker.addJob(new Job(name, hours)); // add job to the worktracker
    }
    
    private void addSpecialJob() // method to add a new special job to the worktracker this is a place holder and template
    {
        String name = JOptionPane.showInputDialog("Enter job name:");
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));
        String special = JOptionPane.showInputDialog("Enter the job's special field:");
        workTracker.addJob(new SpecialJob(name, hours, special));
    }

    private void showJobs() // method to display the list of jobs
    {
    	workTracker.sortJobs(); // call sortjobs method to sort the jobs list before printing
        JOptionPane.showMessageDialog(null, workTracker.jobListToString(), "Job List", // dialog box with the list
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void showTotalHours() // method to display the total hours worked
    {
        JOptionPane.showMessageDialog(null, "Total hours worked: " + workTracker.getTotalHours(), "Total Hours", 
                JOptionPane.INFORMATION_MESSAGE); // dialog box with hours worked
    }
    
    private void searchJobs() 
    {
        String searchTerm = JOptionPane.showInputDialog("Enter search term:"); // prompt user for search term
        Job job = workTracker.getJob(searchTerm); // call getjob method from worktracker class and pass searchterm
        if (job != null) // if the job is found
        { // display the found job in a dialog box
            JOptionPane.showMessageDialog(null, job.toString(), "Search Result", JOptionPane.INFORMATION_MESSAGE);
        } 
        else // otherwise 
        {	// display the job not found message in a dialog box
            JOptionPane.showMessageDialog(null, "Job not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
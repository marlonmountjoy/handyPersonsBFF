package handyPersonsBestFriend;
// I reused my quick sort from class!! very excited 
public class Sort 
{
	public static void quickSort(int[] theArray) // wrapper method for quick sort to set the range
	{
        quickSort(theArray, 0, theArray.length - 1);
    }
	
	public static void quickSort(int[] theArray, int low, int high) // method to quick sort an integer array
	{
        if (low < high) // exit recursion when the pointers cross
        {
            int pivotIndex = partition(theArray, low, high); // partition the array and get the pivot index
            
            quickSort(theArray, low, pivotIndex - 1); // recursively sort the elements to the left of the pivot
            quickSort(theArray, pivotIndex + 1, high); // recursively sort the elements to the right of the pivot
        }
    }
	
	private static int partition(int[] theArray, int low, int high) // helper method to partition the array for quicksort
	{
        int pivot = theArray[high / 2]; // choose the last element as the pivot
        int i = (low - 1); // set the initial index for elements smaller than the pivot

        for (int j = low; j <= high - 1; j++) // iterate through the array comparing each element with the pivot
        {
            if (theArray[j] < pivot) // if current element is smaller than the pivot
            {
                i++; // increment the index for the smaller elements
                int temp = theArray[i]; // swap the elements in the array at the i and j indexes 
                theArray[i] = theArray[j];
                theArray[j] = temp;
            }
        }

        int temp = theArray[i + 1]; // swap the pivot element with the element one past the current i index 
        theArray[i + 1] = theArray[high];
        theArray[high] = temp;

        return i + 1; // return the new pivot index
    }
}
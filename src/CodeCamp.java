//  CodeCamp.java


/*  Student information for assignment:
 *
 *  On my honor, Bryan Vuong, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  UTEID: Bryan Vuong
 *  email address: vuong.bryan@gmail.com
 *  Grader name: 
 *  Number of slip days I am using: 1
 */

import java.util.Random;

public class CodeCamp {
    
    public static void main(String[] args){
        
        final String newline = System.getProperty("line.separator");
        
        //test 1 findMajority
        int majorityExpected = -1;
        int[] b = new int[]{2, 1, 3, 3};
        int majorityResult = findMajority(b);
        System.out.println("Testing findMajority({2, 1, 3, 3})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 1, findMajority");
        else
            System.out.println("failed test 1, findMajority");

        //test 2 findMajority
        b[0] = 3; 
        majorityExpected = 0;
        majorityResult = findMajority(b);
        System.out.println(newline + "Testing findMajority({3, 1, 3, 3})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 2, findMajority");
        else
            System.out.println("failed test 2, findMajority");
        
        //test 3 findMajority
        b = new int[]{-1, -1, -1, 0, 0};
        majorityExpected = 0;
        majorityResult = findMajority(b);
        System.out.println(newline + "Testing findMajority({-1, -1, -1, 0, 0})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 3, findMajority");
        else
            System.out.println("failed test 3, findMajority");
        
      //test 4 findMajority
        b = new int[]{4};
        majorityExpected = 0;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({4})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 6, findMajority ");
        else
            System.out.println("failed test 6, findMajority ");
       
        // even split test
        //test 5 findMajority
        b = new int[]{4,0,4,0,4,0};
        majorityExpected = -1;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({4,0,4,0,4,0})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 7, findMajority");
        else
            System.out.println("failed test 7, findMajority");
       
        // odd, majority at end to check how far we check.
        //test 6 findMajority
        b = new int[]{2,3,2,4,4,4,4};
        majorityExpected = 3;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({2,3,2,4,4,4,4})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 8, findMajority");
        else
            System.out.println("failed test 8, findMajority");
       
        // even with maj at end
        //test 7 findMajority
        b = new int[]{5,7,3,9,9,9,9,9};
        majorityExpected = 3;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({5,7,3,9,9,9,9,9})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 9, findMajority");
        else
            System.out.println("failed test 9, findMajority");
        
        // now for a really long one
        //test 8 findMajority
        b = new int[]{3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,2,7,9,5,0,2,8,8,4,1,9,7,1,6,9,3,9};
        majorityExpected = -1;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({pi to 45 digits})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 10, findMajority");
        else
            System.out.println("failed test 10, findMajority");
       
        //now another long one with an actual majority
        //test 9 findMajority
        b = new int[]{6,7,3,4,2,1,3,5,6,2,9,7,8,9,9,9,9,9,7,0,9,9,9,9,9,7,8,6,8,9,9,9,6,5,9,9,9,3,3,9,9,9,9,9,9,9};
        majorityExpected = 10;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({6,7,3,4,2,1,3,5,6,2,9,7,8,9,9,9,9,9,7,0,9,9,9,9,9,7,8,6,8,9,9,9,6,5,9,9,9,3,3,9,9,9,9,9,9,9})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 11, findMajority");
        else
            System.out.println("failed test 11, findMajority");
        
        //even with majority
        //test 10 findMajority
        b = new int[]{4,7,3,3,3,6,9,3,3,3,3};
        majorityExpected = 2;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 12, findMajority");
        else
            System.out.println("failed test 12, findMajority");
        
        // odd with a close one
        //test 11 findMajority
        b = new int[]{6,6,6,8,9,9,9};
        majorityExpected = -1;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({6,6,6,8,9,9,9})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 13, findMajority");
        else
            System.out.println("failed test 13, findMajority");
 
        //test 12 findMajority
        b = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        majorityExpected = 0;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 14, findMajority");
        else
            System.out.println("failed test 14, findMajority");
 
        //test 13 findMajority
        b = new int[]{6,7,8,4,1,1,1,1,5,4,3,7,8,1,1,1,1,1,1,1};
        majorityExpected = 4;
        majorityResult = findMajority(b);
        System.out.println("Testing findMajority({})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 15, findMajority");
        else
            System.out.println("failed test 15, findMajority");
        
        //test 4 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(1, 365)");
        int pairs = sharedBirthdays(1, 365);
        int expectedShared = 0;
        if( pairs == expectedShared )
            System.out.println("passed test 4, birthday problem");
        else
            System.out.println("failed test 4, birthday problem");
        
        //test 5 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(366, 365)");
        pairs = sharedBirthdays(366, 365);
        if( pairs > 0 )
            System.out.println("passed test 5, birthday problem");
        else
            System.out.println("failed test 5, birthday problem");        
        
        //test 6 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(2, 1)");
        pairs = sharedBirthdays(2, 1);
        if( pairs == 1 )
            System.out.println("passed test 6, birthday problem");
        else
            System.out.println("failed test 6, birthday problem. " +
            		"Expected pairs to be 1. Value returned: " + pairs);
        
        //test 7 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(3, 1)");
        pairs = sharedBirthdays(3, 1);
        if( pairs == 3 )
            System.out.println("passed test 7, birthday problem");
        else
            System.out.println("failed test 7, birthday problem. " +
                    "Expected pairs to be 3. Value returned: " + pairs);
        
        //test 8 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(4, 1)");
        pairs = sharedBirthdays(4, 1);
        if( pairs == 6 )
            System.out.println("passed test 8, birthday problem");
        else
            System.out.println("failed test 8, birthday problem. " +
                    "Expected pairs to be 6. Value returned: " + pairs);
        
        //test 9 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(5, 1)");
        pairs = sharedBirthdays(5, 1);
        if( pairs == 10 )
            System.out.println("passed test 9, birthday problem");
        else
            System.out.println("failed test 9, birthday problem. " +
                    "Expected pairs to be 10. Value returned: " + pairs);   

        
        //test 10 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(100, 1)");
        pairs = sharedBirthdays(100, 1);
        if( pairs == 4950 )
            System.out.println("passed test 10, birthday problem");
        else
            System.out.println("failed test 10, birthday problem. " +
                    "Expected pairs to be 4950. Value returned: " + pairs);
        
        
        System.out.println("\nThe Average # of pairs run 20000 times is: " + averagePairs(20000, 183, 365));
        System.out.println("Number of people required to reach 50% probability of 1 pair sharing a birthday:" + percentageCompute(20000));


        
    }
    
    
    /**
     * Determine if there is a majority element in an array of ints.
     * The parameter <tt>list</tt> is not altered as a result of this 
     * method.
     * @param list != null
     * @return  the first index of the value of the majority element if it exists.
     * If a majority element does not exist return -1.
     */
    public static int findMajority(int[] list) {
        assert ( list != null ) : "Violation of precondition: findMajority";
        //Initialize temporary variables
        int freq;
        int value;
        int index;
        //initialize permanent variables that will hold the frequency and index
        int freqP = 0;
        int indexP = 0;
        //Outer For Loop cycles through values
        for(int i=0; i<list.length; i++)
        {
        	freq=0;
        	value = list[i];
    		index = i;
    			//Inner For Loop cycles through values comparing the value from the outer to all other values
    			//in the array
	        	for(int j=0; j<list.length; j++)
	        	{
	        		if(value == list[j])
	        		{
	        			freq++;
	        		}
	        	}
		        	//If the newest value found occurs more often, that becomes the new majority value
	        		if(freqP < freq)
		        	{
		        		freqP = freq;
		        		indexP = index;
		        	}
	        	}
	        	
        //Check to make sure the frequency occurs more than half of the total elements to truly be
        // a majority before returning
        if(list.length/2 < freqP)
        	return indexP;
        else
        	return -1;
    }
    
    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people. 
     * Return the number of pairs of people that share the
     * same birthday.
     * @param numPeople The number of people in the experiment.
     * This value must be > 0
     * @param numDays The number of days in the year for this experiment.
     * This value must be > 0
     * @return The number of pairs of people that share a birthday.
     */
    public static int sharedBirthdays(int numPeople, int numDays) {
        assert numPeople > 0 && numDays > 0 : "Violation of precondition: parameters" +
        		" must be greater than 0. numPeople: " + numPeople + 
        		", numDays: " + numDays;
        
        // Initialize variables 
        int day;
        int total;
        int pairs = 0;
        int seen;
        
        // Array has as many elements as people and holds their respective random birthdays
        int[] Array = new int[numPeople];
        
        // Used is an array that contains the birthdays that have already been checked to ensure that 
        // birthdays already counted aren't counted again
        int[] Used = new int[numPeople];
        int usedSize = 0;
        
        // Insert the randomly generated birthdays into Array[]
        Random ran = new Random();
        for(int i=0; i<Array.length; i++)
        {
        	Array[i] = ran.nextInt(numDays)+1;
        }
        
        // Outer For Loop gets birthday values for comparison 
        for(int j=0; j<Array.length; j++)
        {
        	
        	// Reset total # of people found sharing birthdays, acquire the next day to be checked,
        	// and reset seen variable
        	total = 0;
        	day = Array[j];
        	seen = 0;
        	
        	// Checks to see if the day that was taken to be compared has been used
        	// If it has already been used, seen is incremented
        	for(int m=0; m<usedSize; m++)
        	{
        		if(day == Used[m])
        			seen++;
        	}
        	
        	// If seen is not 0, then that means that the value currently to be compared has already been
        	// compared so it gets skipped instead so the combinations and pairs aren't computed and added
        	if(seen == 0)
        	{
        		for(int k=0; k<Array.length; k++)
        		{
        			// Since the day chosen hasn't been compared yet, the for loop goes into Array[] and
        			// compares values and finds the amount of days that share that particular day
        			if(day == Array[k])
        				total++;
        		}
        		
        		// From the amount of people found sharing that day, total, the amount of pairs is computed
        		// This is added to the pairs running total that is to be returned
        		pairs += combination(total, 2);
        		
        		// Since the day just used has been compared, it's added to the Used array and the size
        		// is incremented
        		Used[j] = day;
        		usedSize++;
        	}
    }
        return pairs;
    }



	// The combination method computes the amount of possible combinations when given a set of size n
    // to be divided into r groups
    public static int combination(int n, int r)
	{
		
    	//Checks to see if n and r are 0. Saves time
    	if(n>=0 && r>0)
		{
			// Initialize variables
    		int diff = n-r;
			int nFact = 1;
			int rFact = 1;
			int diffFact = 1;
			
			// If r is greater than n-r, diff, than the algorithm computes the combinations by accounting for if r! was already divided into n!
			if(r > diff)
			{
				
				for(int i=r+1; i<=n; i++)
				{
					nFact *=i;
				}
				for(int j = 1; j<=diff; j++)
				{
					diffFact *=j;
				}
				return nFact/diffFact;
			}
			
			// If diff is greater than r, than the algorithm computes the combinations by accounting for if n-r! was already divided into n!
			// Case where n-r == r is accounted for since either algorithm will compute if n-r == r
			else
			{
				for(int k=diff+1; k<=n; k++)
				{
					nFact *=k;
				}
				for(int m = 1; m<=r; m++)
				{
					rFact *=m;
				}
				return nFact/rFact;
			}
			
			
		}
		else
			return 0;
	}
   
    // Average Birthday Test
   //Run 20000 times, 365 days, and 182 people. Computes the average.
    public static int averagePairs(int tests, int people, int days)
    {
    	int average = 0;
    	int totalPairs = 0;
    	
    	// Runs an sharedBirthdays tests amount of times
    	for(int i=0; i<tests; i++)
    	{
    		totalPairs += sharedBirthdays(people, days);
    	}
    	
    	// The average # of pairs found per test run is computed
    	average = totalPairs/tests;
    	return average;
    }
    
    // # Of people to reach a >50% experiment
    // Run 20000 times, 365 days, people: 2-100
    // What is the amount of people for percentage to be >50%?
    public static int percentageCompute(int tests){
            
        // Total keeps track of how many pairs have been found
    	int total;    
    	double percent = 0.0;
        int peeps = 2;
            
            
        	while( percent <= 50.0){
                total = 0;
                
                // Runs 20000 experiments to see how many times people share a birthday
                for (int i = 0; i<tests;i++){
                    if(sharedBirthdays(peeps,365) > 1){
                    total++;
                    }
                }
                
                // If the percentage calculated from the total is greater than 50%, the amount of people is outputed
                percent = (total/tests)*100;
                if (percent <= 50.0){
                    peeps++;
                }
            }
            return peeps;
        }  
    
    
    
    /*
     * The Average # of pairs with a group of 182 people and 365 days run 20000 times is: 162
     * Computed using averagePairs method
     * 
     * The Number of people required to reach 50% probability with 1 pair sharing a birthday is: 3
     * Computed using percentageCompute method
     */
}
	
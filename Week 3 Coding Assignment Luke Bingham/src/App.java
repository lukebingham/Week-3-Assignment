
public class App {

	public static void main(String[] args) {
		// Array of int called ages
		
		int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 127};
		
		int firstAge = ages[0];
		int lastAge = ages[ages.length-1];
		
		System.out.println("The last age subtracted by the first age is: " + (lastAge - firstAge));
		
		// Find the average age in ages array
		
		int sum = 0;
	    for(int i = 0; i < ages.length ; i++)
	        sum = sum + ages[i];
	    
	    int average = sum / ages.length;
	    System.out.println("The rounded average age is : " + average); 
        
		// Array of String called names
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		// Calculate average number of letters per name
		
		int totalLetters = 0;
		
		for(String name : names) {
			totalLetters += name.length();
		}
		
		int averageOfNames = totalLetters / names.length;
		
		System.out.println("The rounded average of letters per name is: " + averageOfNames);
		
		// Concatenate all the names together using loop separated by spaces
		
        for (String name : names) {
        System.out.print(name + " ");	
        }
        
        System.out.println(); // Created blank print line to offset above print
        
        // #3 QUESTION: How do you access the last element of any array?
        // ANSWER: For an array named values, values[values.length-1];
        
        // #4 QUESTION: How do you access the first element of any array?
        // ANSWER: For an array named values, values[0];
        
        // EXAMPLES: I used both of these formats on lines 9 & 10 of this code.
        
        
		// Create array of int called nameLengths
        // loop to iterate over the previously created names array
        // add the length of each name to the nameLengths array
        
        int[] nameLengths = new int[]{3, 5, 3, 5, 4, 3};
        
        int sumOfEach = 0;
        for(String name : names) {
        	sumOfEach = name.length();
        	System.out.println(sumOfEach);
        }
        
        // loop to iterate over the nameLengths array
        // and calculate the sum of all the elements in the array
        
        int sum1 = 0;
        
        for (int name : nameLengths) {
        	sum1 += name;
        }
        System.out.println("The sum of all letters in all names is: " + sum1);
        
        // Method that takes string and int, and concatenates itself n times
        
        System.out.println(combineStrings("Hello",3));
        
        // Method that takes 2 strings and returns a full name separated by space.
        
        System.out.println(createFullName("Steve","Rodgers"));
        
        // method that takes array of int
        // returns true if sum of array is greater than 100
        
        int[] values = new int[]{10, 12, 26, 39, 45};
        
        System.out.println(isGreaterThan100(values));
        
        // method that takes array of double 
        // returns the average of all the elements in the array
        
        double[] values2 = new double[]{7.77, 8.88, 9.99};
        
        System.out.println(findAverageOfElements(values2));
        
        // method that takes two arrays of double and returns true if the average
        // of the elements in the first array is greater than the average of the elements in the second array
        
        double[] values3 = new double[]{1.11, 2.22, 3.33};
        
        System.out.println(compareAverages(values2, values3));
        
        // method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
        // returns true if it is hot outside and if moneyInPocket is greater than 10.50
        
        Boolean isHotOutside = true;
        double moneyInWallet = 11.25;
        System.out.println("Will buy drink?: " + willBuyDrink(isHotOutside, moneyInWallet));
        
        // Create my own method that solves a problem
        // method for phone inventory that lists the inventory and a total of what we have in stock
        
        String[] inventory = new String[] {"43G", "45G", "47G", "49G"};
        
        System.out.println("We currently have " + countItemsAvailable(inventory) + " phones in stock.");
	
	}
        
	public static String combineStrings (String word, int n) {
			String newString = "";
			for (int i = 0; i < n; i++) {
				newString += word;
			}
			return newString;
				
		}

    public static String createFullName (String x, String y) {
    	String fullName = x + " " + y;
    	return fullName;
    	
    }
    
    public static Boolean isGreaterThan100 (int[] values) {
    	int sum = 0;
    	for (int value : values) {
    		sum += value;
    	}
    	if (sum > 100) return true;
    	return false;
    	
    }
    
    public static Boolean compareAverages (double[] values2, double[] values3) {
    	return findAverageOfElements(values2) > findAverageOfElements(values3);
    }
    
    public static double findAverageOfElements (double[] values2) {
    	double sum = 0.0;
    	double count = 0.0;
    	
    	for (double value2 : values2) {
    		sum = sum + value2;
    		count += 1.0;
    	}
        return sum / count;
    	
    }
    
    public static Boolean willBuyDrink (Boolean isHotOutside, double moneyInPocket) {
    	if (isHotOutside && moneyInPocket > 10.50) return true;
    	return false;
    	
    }
    
    public static int countItemsAvailable (String[] inventory) {
    	int sum = 0;
    	for (String item : inventory) {
    		sum++;
    		System.out.println("Part #:" + item);
    	}
    	return sum;
    
    }
    
}
		
		
	



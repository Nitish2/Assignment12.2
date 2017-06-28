package ExceptionHandling;

	import java.util.Scanner;
	public class ExceptionDemo {
	    public static void main(String[] args) {
	        System.out.println("Enter the 5 Strings");
	        
	        String[] arr = new String[5]; // Initializing the string array of size 5
	        Scanner sc = new Scanner(System.in); // Scanner object to get the user input
	                                                
	        for (int i = 0; i < 5; i++) { // Getting input from the user
	                                               
	            
	            arr[i] = sc.next();
	                   }  
	        String str;
	        System.out.print("Enter the string to search: ");
	        str = sc.next(); // Getting the search string from user
	        String str1 = searchString(arr, str); // calling the method to search
	                                                // string in array
	        if (str1 == null) { // If and else condition to check weather the string is found or not
	                            
	            System.out.println("String not found.");
	        } else { 
	            System.out.println("String found.");
	        }
	        sc.close();	// Closing the scanner
	    }
	    
	    
	    // method to search the string
	    private static String searchString(String[] arr, String str) {
	        try {
	            int i;
	            for (i = 0; i < arr.length; i++) { // for loop to search the string
	                                                
	                if (arr[i].equals(str)) { // Break statement to come out from the loop
	                    break;
	                }
	            }
	            if (i == arr.length) { /** If i= array length ,
	                                     the whole array traversed but
	                                    string not found
	                                    **/
	                throw new ValueNotFoundException();// So exception is thrown
	            } else {
	                return str; // if i < array length, it means value found
	                            
	            }
	        } catch (ValueNotFoundException e) {
	            return null; // If exception caught then null is returned
	        }
	        
	    }
	}
	

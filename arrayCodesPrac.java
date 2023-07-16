package javaPractiseCodes;

 import java.util.Arrays;

public class arrayCodesPrac {

	public static void main(String[] args) {				// ***TESTING***
		// TODO Auto-generated method stub
		 int [] num =  { 4, 4, 0, 76, 45, 23, 2, 27, 1};
		System.out.println(sortingNumericArray(num) + " NUMERIC Sorting done " + "\n");
		
		String[] arr = { "usmaniiiii", "ali", "eiman", "zain", "billie"};
		System.out.println(sortingStringArray(arr) + " STRING Sorting done " +"\n" );
	
		 int [] num2 = { 4, 1, 2, 2, 2, 1};
		System.out.println(sumArray(num2) + "\n");

		double [] num3 =  { 4.5, 6, 4, 4.5, 6, 2, 4};
		System.out.println(averageArray(num3) + "\n");

		int [] num4 = { 4, 45, 23, 2, 27, 1} ;
		System.out.println(findValue(num4, 45));

		int [] num5 = { 4, 45, 23, 2, 27, 1} ;
		System.out.println(findIndex(num5, 23)+"\n");
		
		int [] num11 =  { 2, 4, 56, 23, 10, 10, 23};

		
		System.out.println(removeElement(num11, 10) + "\n");
		
		int [] num6 = { 4, 45, 23, 2, 27, 1} ;

		System.out.println(insertElement(num6, 786, 0)+ "\n");
		
		int [] num7 = { 4, 45, 23, 2, 27, 1} ;

		System.out.println(maxValue(num7)+ "\n");

		int [] num8 =  { 786, 23, 45, 12, 10, 5, 2};

		System.out.println(reverse(num8)+"\n");
		
		//int [] num9 = {1, 2, 5, 5, 6, 6, 7, 2};
		
		//duplicate_int(num9);
		
		int [] num10 = {2, 3, 10, 98, 3, 10, 146};
		occur(num10);
		
		String [] names =  { "usman", "eiman", "zain", "billie", "eiman", "billie"};
		duplicate_string(names);
		
		String [] names2 = { "usman", "ezaan", "hassan", "eiman", "ayesha", "mariyam"} ;
		common_elements(names,names2) ;
		
		//int [] num11 =  { 2, 4, 56, 23, 10, 10, 23};
		System.out.println(remove_item(num11,10));
		
		System.out.println(remove_duplication(num11));
		
		int [] num12 =  { 24, 3, 4, 56, 7866, 67, 999};
		System.out.println(largest(num12));
		
		System.out.println(second_largest(num12));
		
	}

	
	
	// program to **sort** a (numeric array) and a (string array)
	// ***insertion sorting done***
	
	static String sortingNumericArray(int[] array) {		// NUMERIC Array sorting!
		
		// { 4, 45, 23, 2, 27, 1}
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array.length; j++) {
				if( array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		} 
		
		return Arrays.toString(array);
	}
	
	static String sortingStringArray(String[] array) {		// STRING Array sorting!
		
		// { "usman", "ali", "eiman", "zain", "billie"}
		for (int i =0; i<array.length; i++) {
			for (int j = i+1; j<array.length; j++) {		// *** .compareTo is a String comparision function***
				if (array[i].compareTo(array[j]) > 0) {		// returns value>0 if string is greater,  
					String temp = array[i];					// returns value<0 if string is smaller
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return Arrays.toString(array);
	}
	
	
	
	//program to sum values of an array.
	
	static String sumArray(int[] array) {				// SUM of values in array!
		// { 4, 45, 23, 2, 27, 1}
		int sum = 0;
		for( int i=0; i<array.length; i++) {
			sum = sum + array[i];
		}
		
		Arrays.toString(array);
		
		String answer= "The sum of all the values in array " + Arrays.toString(array) + " is: \n" + Integer.toString(sum);
		
		return answer;
	}
	
	
	// program that calculates **AVERAGE** value of elements in an array.
	
	static String averageArray(double [] array) {
		// { 4.5, 6, 4}
		double sum = 0;
		int count = 0;
		for (int i =0; i<array.length; i++) {
			count++;
			sum = sum + array[i];
		}
		double average = sum/count;
		
		String answer = "The Avergae value of this array " + Arrays.toString(array) + " is \n" + Double.toString(average);
		
		return answer;
	}
	
	
	
	//program to test if an array contains a specific value.
	
	static String findValue(int[] array, int find) {			// FINDING VALUE in array!
		String ans = "";
		for (int i=0; i< array.length; i++) {
			if ( array[i] == find) {
				 ans =  "Value was found at index \n" + i;
				break;
			}
			else {
				ans = "value NOT found!";
				
			}
		}
		return ans;
	
	}
	
	
	
	//program to find the index of an array element.
	static String findIndex(int[] array, int find) {			// FINDING INDEX of a value in array!
		// { 4, 45, 23, 2, 27, 1}  
		int location = 0;
		String ans = "";
		for (int i=0; i< array.length; i++) {
			if ( array[i] == find) {
				location = i;
				ans = "Your Value was found at index: /n " + location;
				break;
			}
			ans = "value not found";
			
				
		}
		return ans;
		
	}
	
	
	
	//program to remove a specific element from an array. Q7.		 // REMOVE element from array!
	
	static String removeElement(int[] array, int remove) {
		// { 4, 45, 23, 2, 27, 1}  
		// *remove 23*
		for ( int i=0; i<array.length; i++) {
			if ( array[i] == remove) {
				for (int j=i; j<array.length-1;) {
					array[j] = array[j+1];
					break;
				}
			}
		}
		String afterRemoving = "After removing the element, " + remove + ":\n" + Arrays.toString(array);
		
		return afterRemoving ;
	}
	
	
	//program to insert an element (specific position) into an array
	
	static String insertElement(int[] array,int value, int location ) {			//INSERT element!
		// { 4, 45, 23, 2, 27, 1}  
		//786 //*location 3*
		
		for (int i=array.length-1; i>location; i--) {
			array[i] = array[i-1];
			}
		array[location] = value;
		
		
		String answer = "The value " + value + " is added to the list at index" + location + "\n" + Arrays.toString(array) ;
		
		
		
		return answer;
		
	}
	
	
	//max and minimum value in an array							// MAXIMUM & MINIMUM  value in array!
	
	static String maxValue(int[] array){
		// { 4, 45, 23, 2, 27, 1}  
		int max = array[0];
		for (int i=0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		String answer = "The maximum value in the array " + Arrays.toString(array) + " is: \n" + max;
		
		return answer;
		
	}
	
	
	//program to reverse an array of integer values.			// REVERSE array of integer values!
	
	static String reverse(int [] array) {
		// { 786, 23, 45, 12, 10, 5, 2}
		int startPointer = 0;
		int endPointer = array.length-1;
		
		while (startPointer< endPointer) {
			int temp = array[startPointer];
			array[startPointer] = array[endPointer];
			array[endPointer] = temp;
			startPointer++;
			endPointer--;
		}
		
		String answer = "The reverse of the array is \n" + Arrays.toString(array);
		
		return answer;
		
	}
	
	
	//program to find duplicate values in an array of **INTEGER** values.		// DUPLICATE values find INTEGER!
	
	static String duplicate_int(int [] array) {
		// {5, 2, 7, 7, 5, 4}
		int count = 1;
		if(array.length ==0) {
			String ans = "-1.0";
			return  ans;
		}
		for (int i=0; i<array.length;i++) {
			for (int j=i+1; j<array.length; j++) {
				if ( array[i] == array[j]) {
					count++;
				}
			}
			if (count >1) {
				String answer =  array[i] + ": " + count;
				String newline = "\n";
				System.out.println(answer+newline);
				}
			count = 1;
				 
			}
		return "";
		}
		
	
	static String occur(int [] array) {			//method checks the integers that are even and in the range 2 inclusive to 100 exclusive and 
												//counts how many occurrences of each are in the array
		 // [2, 10, 10, 98, 3, 146]
		String answer = "";
		int count = 0;
		int count2 = 0;
		
		if(array.length ==0) {
			String ans = "-1.0";
			return  ans;
		}
		for (int i=0; i<array.length;i++) {
			for (int j=i+1; j<array.length-1; j++) {
				if ( array[i] == array[j] && array[i] % 2==0 && array[i] >= 2 && array[i] <100 ) {	//duplicate values
					count++;
				}
				else if (array[i] != array[j] && array[i] % 2==0 && array[i] >= 2 && array[i] <100 ) {	//NOT duplicate
						count2=1;
					}
			}
			if (count >1) {
				 answer =  array[i] + ": " + count;
				String newline = "\n";
				System.out.println(answer+newline);
				}
			else if ( count2 ==1) {
					answer =  array[i] + ": " + count2;
					String newline = "\n";
					System.out.println(answer+newline);
				}
				
					
			count = 1;
			count2 = 0;
				 
			

		}
		return "";

	}
	
	
	
	//program to find duplicate values in an array of **STRING** values.		//DUPLICATE Values find STRING!
	
	static String duplicate_string(String [] array) {
		// { "usman", "eiman", "zain", "billie", "eiman", "billie"}
		int count = 1;
		for (int i=0; i<array.length;i++) {
			for (int j =i+1; j<array.length; j++) {
				if ( array[i] == array[j]) {
					count++;
					
				}
			}
			if (count>1) {
				String answer = "Duplicate element:" + array[i] +"\n";
				System.out.println(answer);
			}
			count =1;
		}
		
		
		
		return "";
	}
	
	
	//program to find common elements between two arrays (string values)
	
	static String common_elements(String [] array1, String [] array2) {
		// { "usman", "eiman", "zain", "billie", "eiman", "billie"}   --->array1
		// { "usman", "ezaan", "hassan", "eiman", "ayesha", "mariyam"}  --->array2
		for (int i =0; i<array1.length; i++) {
			for (int j=0; j <array2.length; j++) {
				if (array1[i] == array2[j]) {		// common element!
					System.out.println("Common element is: " + array1[i]);
				}
			}
			/*if (count >1) {
				String answer = "Common element is: " + array1[i] + "\n";
				System.out.println(answer);
			}
			count =1;*/
		}
		
		return "";
	}
	
	
	
	static String remove_item(int [] array, int remove) {			// REMOVE item from ARRAY!
		// { 2, 4, 56, 23, 4, 45, 23, 10, 10}
		int [] temp = new int[array.length-1];
		int j =0;
		for (int i =0; i<array.length; i++) {
			if (array[i] != remove) {
				 temp[j] = array[i];		// unique elements store in temp array.
				j++;
				
				
			}
		}
		String answer = "The item " + remove +" has been removed from the array;" + "\n" + Arrays.toString(temp) + "\n";
		return answer;
		
	}
	
	
	static String remove_duplicate(int [] array) {
		// { 2, 4, 56, 23, 4, 45, 23, 10, 10}
		int [] temp = new int[array.length-1];		//unique elements array
		int j =0;
		for (int i=0; i<array.length-1; i++) {
			if (array[i] != array[i+1]) {
				temp[j] = array[i];					//unique elements added to temp array.
				j++;
			}
			
		
		}
		
		 String answer = "No duplicay here; " + Arrays.toString(temp);
		
		return answer;
	}
	
	static String remove_duplication(int [] array) {				//**remove DUPLICATION CODE!**
		
		int unique_elements = array.length;
		for ( int i=0; i<array.length; i++) {
				for (int j=i+1; j<array.length;j++) {
					if(array[i] == array[j]){
					array[j] = array[unique_elements-1];
					unique_elements--;
					j--;
				}
				
			}
		}
		
		String answer = "No duplicay here; " + Arrays.toString(array) + "\n";
		
	
	
	
	return answer;
	}
		

	//program to find the second largest element in an array.			
		
	static String largest(int [] array) {					//LARGEST element find!
															
		// { 24, 3, 4, 56, 786, 67, 999}
		int max = array[0];
		for (int i=0; i<array.length;i++) {
			for (int j=0; j<array.length; j++) {
				if (array[i] > array[j]) {
					max = array[i];			//NO SORTING REQUIRED!
				}
			}
		}
		
		String answer = "The largest value in this array " + Arrays.toString(array) + " is: \n" + max + "\n";
		
		
		return answer;
	}
	
	
	static String second_largest(int [] array) {		//2nd LARGEST element find!
		
		// { 24, 3, 4, 56, 786, 67, 999}	
		for (int i=0; i<array.length;i++) {
			for (int j=i+1;j<array.length; j++) {
				if ( array[i]< array[j]) {		
					int temp = array[i];		//sorting is required descending order!
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		String answer = "Sorted array: " + Arrays.toString(array) + "\n" +"The 2nd largest element is: " + array[1] + "\n" + "The 3rd largest element is: " + array[2]; 
		
		
		return answer ;
		
	}
	
	
	

	// program thats counts elements in an array and **ignores the repeated elements.**
	static int countArrayWithoutRepetition(int[] arr) {
		
		int count = 0;
		for (int i=0; i<arr.length;i++) {
			count++;
			for(int j =i+1; j<arr.length;j++) {
				if (arr[i] == arr[j]) {			
					count =count -1;
				}
			}
		}
		return count;
}}

package arraysprograms;

import java.util.Arrays;

public class ArrayPrograms {

	public static void main(String[] args) {
/*Arrays are dynamically allocated in Java
 * Arrays are objects in java,we can find their length using member length
 * Arrays are inserted in index manner and always starts with 0th index
 * Size of an Array must be specified an int
 * 
 */
		int oddNumbers[] = {1,3,5,7,9,11,13,15,17,19,21};
		System.out.println("Lenth of the Array is : " + oddNumbers.length);
		System.out.println("0th element value is : " + oddNumbers[0]);
		System.out.println("1st element value is : " + oddNumbers[1]);
		System.out.println("2nd element value is : " + oddNumbers[2]);
		System.out.println("3rd element value is : " + oddNumbers[3]);
		System.out.println("4th element value is : " + oddNumbers[4]);
		System.out.println("5th element value is : " + oddNumbers[5]);
		System.out.println("6th element value is : " + oddNumbers[6]);
		System.out.println("7th element value is : " + oddNumbers[7]);
		System.out.println("8th element value is : " + oddNumbers[8]);
		System.out.println("9th element value is : " + oddNumbers[9]);
		System.out.println("10th element value is : " + oddNumbers[10]);
		//System.out.println("11th element value is : " + oddNumbers[11]);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 11
			at arraysprograms.ArrayPrograms.main(ArrayPrograms.java:25)
		 */
		System.out.println("*******************************************");

		//using for loop 
		for(int i=0;i<oddNumbers.length;i++) {
			System.out.println("Odd Number Element is : " + oddNumbers[i]);
		}
		System.out.println("*******************************************");
		//using for each loop
		for(int ele : oddNumbers) {
			System.out.println("Odd Numbers are : " + ele);
		}
		System.out.println("*******************************************");
		//cloning of an Array
		String b[] = { "book-A", "book-B", "book-C" };
		String b1[] = b.clone();
		String b2[] = b;
		System.out.println(b1.equals(b));
		System.out.println(b1.equals(b2));
		//char converting to String
		System.out.println(b[2]);
		char ch[] = {'b','o', 'o', 'k', '-', 'D'};
		String temp = new String(ch);
		System.out.println(temp);
		System.out.println("*******************************************");
		b[2]=temp;
		System.out.println(b[2]);
		System.out.println("*******************************************");
		for(String bk : b) {
			System.out.println(bk);
		}

		
	//Even numbers Array 
		int evenNumbers[] = {2,4,6,8,10,12,14,16,18,20,22,24};
		//System.out.println(evenNumbers);
		int evenNumberSet[] = Arrays.copyOf(evenNumbers, 5);
		System.out.println("-----------------------");
		for(int ele : evenNumberSet) {
			System.out.println(ele);
		}
		
		System.out.println("-----------------------");
		
		int evenNumbersSet[] = Arrays.copyOf(evenNumbers, evenNumbers.length);
		for(int ele1 : evenNumbersSet ) {
			System.out.println(ele1);
		}
		System.out.println("-----------------------");

		//Allocate the array index
		int arr [] = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		for(int arra : arr) {
			System.out.println(arra);
		}
		
		System.out.println("-----------------------");

	}

}

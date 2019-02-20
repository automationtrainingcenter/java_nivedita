package basics;
/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */
public class ArraysDemo {
	
	public static void main(String[] args) {
		//array declaration
		int[] numbers = new int[5];
		
		//assigning values to arrays
		numbers[0] = 12;
		numbers[1] = 14;
		numbers[2] = 13;
		numbers[3] = 15;
		numbers[4] = 16;
//		numbers[5] = 17;
		
		//retrieve the data
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//initialization
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	
		//length of an array
		System.out.println("number of elements in numbers array is "+numbers.length);
		
		
		System.out.println(vowels[0]);
		System.out.println(vowels[1]);
		System.out.println(vowels[2]);
		System.out.println(vowels[3]);
		System.out.println(vowels[4]);
		
		
		
		// 2D arrays
		int[][] matrix1 = new int[2][2];
		
		//assingning values to the matrix
		matrix1[0][0] = 1;
		matrix1[0][1] = 0;
		matrix1[1][0] = 0;
		matrix1[1][1] = 1;
		
		// retrieving values from the matrix
		System.out.print(matrix1[0][0]+"\t");
		System.out.println(matrix1[0][1]);
//		System.out.println();
		System.out.print(matrix1[1][0]+"\t");
		System.out.println(matrix1[1][1]);
		
		int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		System.out.print(matrix2[0][0]+"\t");
		System.out.print(matrix2[0][1]+"\t");
		System.out.print(matrix2[0][2]+"\n");
		System.out.print(matrix2[1][0]+"\t");
		System.out.print(matrix2[1][1]+"\t");
		System.out.print(matrix2[1][2]+"\n");
		System.out.print(matrix2[2][0]+"\t");
		System.out.print(matrix2[2][1]+"\t");
		System.out.print(matrix2[2][2]+"\n");
		
		
		
		 
		
	}

}

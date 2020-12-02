package JavaProgramms;

public class Array {
	
	public static void main(String[] args) {
		
		//Sysntax 
		// datatype[] arrayName = new datatype[arraySize]
		
		int[] arr = { 11, 22, 33, 44, 55 };
		
		for(int values: arr)
		{
			System.out.println(values);
		}
		
		System.out.println("============");
		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]);
		 */
		
		//Example2
		int[] arr1 = {11,22,33,44,55};
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("============");
		//Example3
		//2D Declarations
		int[][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 22;
		a[1][2] = 33;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);

	}
}

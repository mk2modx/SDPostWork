public class ArrayTest {

	public static void main(String[] args){


	int[] intArr = {0, 1, 2, 3 , 4};
	
	System.out.println("Array in Method");
	printArray(intArr);

	System.out.println("Array in main");

	for(int i = 0; i < intArr.length; i++){
	System.out.println(intArr[i]);
}

}

public static void printArray(int[] array){

	array[0] = 9;
	array[3] = 8;

	for(int i = 0; i < array.length; i++){
	System.out.println(array[i]);

	}

}



}

/*
 Time: O(N^2) space: O(1),    Where n is the length of the Array.
 Best Case cenario, For examble the array we received is already sorted
 Then the Time Complexity is O(n), where n is the length of the array
*/
import java.util.*;

class InsertionSort {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
		if(array.length == 0){
			return new int[] {};
		}
		for(int i=1; i< array.length; i++){
			int j = i;
			while( (j > 0) && (array[j] < array[j-1]) ){
				swap(j, j-1, array);
				j--;
			}
		}
		return array;
  }

	public static void swap(int j, int i, int[] array){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

  public static void main(String[] args){
    int[] newArray = {2,10,200,12,20,12,21,100,1,0};

    System.out.print("Array Before Srting : ");
    System.out.print("[ ");

    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + ", ");
    }
    System.out.println("]");

    insertionSort(newArray);

    System.out.print("Array After Srting : ");
    System.out.print("[ ");
    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + ", ");
    }
    System.out.println("]");
  }
}

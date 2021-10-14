/*
 Time: O(N^2) space: O(1),    Where n is the length of the Array.
 Best Case cenario, For examble the array we received is already sorted
 Then the Time Complexity is O(n), where n is the length of the array
*/
import java.util.*;

class BubbleSort {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
		if(array.length == 0){
			return new int[] {};
		}
		int counter =0;

		boolean swapHasBeenMade = false;
		while(!swapHasBeenMade){
			swapHasBeenMade = true;
			for(int i=0; i< array.length -1 - counter; i++){
				if(array[i] > array[i+1]){
					swap(i, i+1, array);
					swapHasBeenMade = false;
				}
			}
			counter ++;
		}
		return array;
  }

	public static void swap(int i, int j, int[] array){
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

    bubbleSort(newArray);

    System.out.print("Array After Srting : ");
    System.out.print("[ ");
    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + ", ");
    }
    System.out.println("]");
  }
}

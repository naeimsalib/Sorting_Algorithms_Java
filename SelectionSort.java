/*
 Time: O(N^2) space: O(1),    Where n is the length of the Array.
*/

import java.util.*;

class SelectionSort {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
		int [] sortedArray;
		if(array.length == 0){
    	return new int[] {};
		}
		int currentIdx = 0;
		while(currentIdx < array.length -1){
			int smallestIdx = currentIdx;
			for(int i = currentIdx + 1; i < array.length; i++){
				if(array[smallestIdx] > array[i]){
					smallestIdx = i;
				}
			}
				swap(currentIdx, smallestIdx, array);
				currentIdx++;
		}
		return array;
  }

	public static void swap(int i, int j, int [] array){
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

    selectionSort(newArray);

    System.out.print("Array After Srting : ");
    System.out.print("[ ");
    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + ", ");
    }
    System.out.println("]");
  }

}

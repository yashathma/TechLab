package Day2;

import java.util.Random;

public class InsersionSort {

	public static void main(String[] args) {
		//Making Random Array
		Random rand= new Random();
		int array[]=new int [rand.nextInt(10)];
		for(int i=0;i<array.length;i++) {
			array[i]=rand.nextInt(100);
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		insersionSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

	private static void insersionSort(int[] array) {
		for (int i = 1; i < array.length; i++) { 
			int key = array[i]; 
			int j = i - 1; 
			while (j >= 0 && array[j] > key) { 
				array[j + 1] = array[j]; 
				j = j - 1; 
			} 
			array[j + 1] = key; 
		} 				
	}

}

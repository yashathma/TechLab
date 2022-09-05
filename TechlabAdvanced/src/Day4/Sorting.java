package Day4;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		Random rand= new Random();

		int array[]=new int [rand.nextInt(10)];
		for(int i=0;i<array.length;i++) {
			array[i]=rand.nextInt(100);
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		selectSort(array);
		//boubleSort(array);
		System.out.println();
		System.out.println();

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

	private static void selectSort(int[] array) {
		int min_index;
		for(int i=0; i<array.length-1;i++) {
			min_index=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min_index]) {
					min_index=j;
				}
				if(i!=min_index) {
					int temp=array[i];
					array[i]=array[min_index];
					array[min_index]=temp;
				}
			}
		}
	}

	private static void boubleSort(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}



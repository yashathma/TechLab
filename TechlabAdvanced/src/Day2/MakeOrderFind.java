package Day2;

import java.util.Random;
import java.util.Scanner;
public class MakeOrderFind {

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
		//Ordering Array
		order(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		//Find
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Type the number which you want to find:");
		int answer= scanner.nextInt();
		int high=array.length-1;  
		binarySearch(array,0,high,answer);
	}

	public static void binarySearch(int arr[], int low, int high, int answer) {
		int mid = (low + high)/2;  
		while( low <= high ){  
			if ( arr[mid] < answer ){  
				low = mid + 1;     
			}else if ( arr[mid] == answer ){  
				System.out.println("Element is found on index: " + mid);  
				break;  
			}else{  
				high = mid - 1;  
			}  
			mid = (low + high)/2;  
		}  
		if ( low > high ){  
			System.out.println("Element was not found!");  
		}  


	}

	private static void order(int[] array) {
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

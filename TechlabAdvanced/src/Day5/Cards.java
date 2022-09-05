package Day5;
import java.util.Random;
import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
		String array[]=new String[52];
		for(int i=0;i<=12;i++) {
			array[i]="S"+(i+1);
		}
		int j=1;
		for(int i=13;i<=25;i++) {
			array[i]="D"+(j);
			j++;
		}
		j=1;
		for(int i=26;i<=38;i++) {
			array[i]="C"+(j);
			j++;
		}
		j=1;
		for(int i=39;i<=51;i++) {
			array[i]="H"+(j);
			j++;
		}	
		print(array);
		System.out.println();
		System.out.println();
		shuffle(array);
		print(array);
		System.out.println();
		System.out.println();		
		sort(array);
		print(array);
	}

	private static void sort(String[] array) {
		int minIndex;
		for (int i=0;i<array.length;i++) {
			minIndex=i;
			for (int j=i+1;j<array.length;j++) {
				if(array[j].compareTo(array[minIndex])<0) {
					minIndex=j;
					//Unfinished
				}
			}
		}
	}

	private static void shuffle(String[] array) {

		Random rand=new Random();
		for(int i=0;i<array.length;i++) {
			array[i]=array[rand.nextInt(51)];

		}

	}

	private static void print(String[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}

	}

}

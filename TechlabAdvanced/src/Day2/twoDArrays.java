package Day2;

import java.util.Random;

public class twoDArrays {

	public static void main(String[] args) {
		int twoDarray[][]=new int [4][4];
		Random rand= new Random();
		for (int x=0;x<twoDarray.length;x++) {
			for (int j=0;j<twoDarray.length;j++) {
				twoDarray[x][j]=rand.nextInt(100);
				//System.out.print(twoDarray[x][j]+" ");
			}
			//System.out.println();
		}

for (int[] x:twoDarray) {
	for (int element:x) {
		System.out.print(element+" ");
	}
	System.out.println();
}
	}
	

}

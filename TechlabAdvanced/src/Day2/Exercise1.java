package Day2;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		//1
		/*
		int twoDarray[][]=new int [4][3];
		Random rand= new Random();
		int end=0;
		for (int x=0;x<twoDarray.length;x++) {
			for (int j=0;j<twoDarray[0].length;j++) {
				twoDarray[x][j]=rand.nextInt(100);
				end=end+twoDarray[x][j];
			}
			//System.out.println();
		}
		System.out.println(end);
		 */

		//2
		/*
		int twoDarray[][]=new int [4][4];
		int count=0;
		Random rand= new Random();
		for (int x=0;x<twoDarray.length;x++) {
			for (int j=0;j<twoDarray[0].length;j++) {
				twoDarray[x][j]=rand.nextInt(100);
				if (count==1) {
					twoDarray[x][j]+=10;
				}
				System.out.println(twoDarray[x][j]);

			}
			count++;

		}
		 */
		//3
		int twoDarray[][]=new int [4][4];
		int count=0;
		int end=0;
		end=printSum(twoDarray);
		tenElement(twoDarray);
		System.out.println("Sum is "+end);


	}

	private static void tenElement(int[][] twoDarray) {
		int count=0;
		Random rand= new Random();
		for (int x=0;x<twoDarray.length;x++) {
			for (int j=0;j<twoDarray[0].length;j++) {
				twoDarray[x][j]=rand.nextInt(100);
				if (count==1) {
					twoDarray[x][j]+=10;
				}
				System.out.println(twoDarray[x][j]);

			}
			count++;
	}
		}

	private static int printSum(int[][]twoDarray) {
		Random rand= new Random();
		int end=0;
		for (int x=0;x<twoDarray.length;x++) {
			for (int j=0;j<twoDarray[0].length;j++) {
				twoDarray[x][j]=rand.nextInt(100);
				end=end+twoDarray[x][j];
			}
		}
		return end;
	}
}		












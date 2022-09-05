package Day3;

import java.util.Random;

public class ArraySearch {

	public static void main(String[] args) {
		int twoDarray[]=new int [4];
		Random rand= new Random();
		for (int x=0;x<twoDarray.length;x++) {
			
		}
		boolean find=findNum(twoDarray);
		if (find) {
			System.out.println("10 was found in the array");
		}else if(find==false) {
			System.out.println("10 was not found in the array");

		}

	}

	private static boolean findNum(int[] twoDarray) {
		for(int i=0;i<twoDarray.length;i++) {
			if(twoDarray[i]==3) {
				return true;
			}
			}
		return false;
		}


	}

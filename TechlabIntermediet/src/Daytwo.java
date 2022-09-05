import java.util.Random;
import java.util.ArrayList;
public class Daytwo {
	public static void main(String[] args) {
		//Arrays
		/*
		int[] Randomnum = new int[10];
		Random rand =new Random();
		int arraycount=0;
		int max=0;
		for( int i=0; i<Randomnum.length; i++) {
			Randomnum [i]= rand.nextInt(100);
			System.out.println(Randomnum[i]);
			if(max<Randomnum[i]) {
				max=Randomnum[i];
			}			
			
		}

		arraycount=addtionOfarray(Randomnum,Randomnum.length);
		System.out.println("The sum is "+arraycount);
		System.out.println("The max is "+max);
*/
		//ArrayList
		Random rand=new Random();
		
		ArrayList<Integer>students = new ArrayList<Integer>();
		students = getRandomIntList();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static ArrayList<Integer> getRandomIntList() {
		Random rand=new Random();
		ArrayList<Integer>randlist = new ArrayList<Integer>();
		for (int i=0;i<randlist.size();i++) {
			randlist.add(rand.nextInt(100));
		}
		System.out.println(randlist);
		
		return randlist;
		
		
	}

	
	
	
	
	
	
	
	
	private static int addtionOfarray(int[] randomnum,int length) {
		int end=0;
		int count=0;
		while(count<length) {
			end=end+randomnum[count];
			count++;
		}
		return end;
	}
}

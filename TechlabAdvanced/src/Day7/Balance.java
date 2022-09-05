package Day7;

public class Balance {

	public static void main(String[] args) {
		
		int regParaCount=0;
		int boxParaCount=0;
		int curlyParaCount=0;
		String input="))((";
		check(input,regParaCount,boxParaCount,curlyParaCount);
		
	}

	private static void check(String input, int regParaCount, int boxParaCount, int curlyParaCount) {
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='(') {
				regParaCount++;
			}
			else if(input.charAt(i)==')') {
				regParaCount--;
			}
			else if(input.charAt(i)=='{') {
				curlyParaCount++;
			}
			else if(input.charAt(i)=='}') {
				curlyParaCount--;
			}
			else if(input.charAt(i)=='[') {
				boxParaCount++;
			}
			else if(input.charAt(i)==']') {
				boxParaCount--;
			}
			else {
				System.out.println("Not Balanced");
			}
		}
		if(regParaCount+boxParaCount+curlyParaCount==0) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		
	}

}

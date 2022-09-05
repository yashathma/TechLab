package Day10;

import java.util.Stack;

public class Balance {

	public static void main(String[] args) {
		Stack<Character>s=new Stack();
		String input="()";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='(') {
				s.push(input.charAt(i));
			}else if(input.charAt(i)==')') {
				if(s.isEmpty()) {
				System.out.println("Not balanced");
				}else {
					s.pop();
				}
			}
		}
		if(s.isEmpty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		
	}

}

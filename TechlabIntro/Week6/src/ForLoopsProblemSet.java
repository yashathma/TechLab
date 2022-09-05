
public class ForLoopsProblemSet {

	public static void main(String[] args) {
		/*
for (int i=0;i<10;i++) {
	System.out.println("Techlab Rocks");
}
		
for (int i=100;i>=0;i--) {
	System.out.println(i);
}
		
for (int i=1;i<=100;i++) {
	System.out.println(i);
	if(i%3==0||i%2==0) {
		System.out.println("Yay");

	}

}
*/
		long tries=0;
for (long i=1;i<=100;i++) {
	tries=i*i+tries;
}
System.out.println(tries);
	
		
		
		
		
		
		
		
		
		
		
		
	}
}

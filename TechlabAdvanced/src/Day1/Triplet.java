package Day1;

public class Triplet {

	public static void main(String[] args) {
		int a,b,c;
		for (a=0;a<=1000;a++) {
			for (b=0; b<=1000; b++) {
				for (c=0;c<=1000;c++) {
					if(c*c==a*a+b*b) {
						if(a+b+c==1000) {
						System.out.println("a: "+a+" b: "+b+" c: "+c);
						}
					}
				}
			}
		}
		
		
	}

}

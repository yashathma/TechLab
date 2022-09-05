package Day6;
public class Fibinachi {

	public static void main(String[] args) {
		int n=5;
		System.out.println(f(n));
	}

	public static int f(int n) {
		if(n==1) {
			return 2;
		}
		else {
			return 2* (n-1);
		}
	}
}

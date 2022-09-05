
public class Methods {

	public static void main(String[] args) {

		double rad1=11;
		double area1=calcArea(11);
		double area2=calcArea(13);
		double area3=calcArea(1);
		double area4=calcArea(3.14);
	
		System.out.println(area4);
		
		
	
		
		
	}
public static double calcArea(double radius) {
	
	double area= 3.14 * radius *radius;
	
	return area;
}
	
}

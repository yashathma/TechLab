package Day5;

import java.util.ArrayList;

public class Grades {

	public static void main(String[] args) {
		//Gpa Bigger to smaller
		//Name
		//ID

		ArrayList < Double > gpa =new ArrayList <Double>();
		gpa.add(5.0);
		gpa.add(3.817);
		gpa.add(4.9);

		ArrayList < String > name =new ArrayList <String>();
		name.add("Misha ");
		name.add("Yash");
		name.add("Kartik");

		ArrayList < Integer > ID =new ArrayList <Integer>();
		ID.add(1234);
		ID.add(2345);
		ID.add(3456);


		gpaSort(gpa);


	}

	private static void gpaSort(ArrayList<Double> gpa) {
		int min_index;
		for(int i=0; i<gpa.size()-1;i++) {
			min_index=i;
			for(int j=i+1;j<gpa.size();j++) {
				if(gpa.get(j)<0) {
					min_index=j;
				}
				if(i!=min_index) {
					double temp=gpa.get(i);
					//gpa.get(min_index)=gpa.get(i);
					temp=gpa.get(min_index);
				}
			}
		}

	}


}

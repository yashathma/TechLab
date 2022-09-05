package Day6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Student Yash = new Student(5.0, 1234, "Yash");
		Student Kartik = new Student(4.0, 2345, "Kartik");
		Student Misha = new Student(3.0, 3456, "Misha");
		Student Ben = new Student(1.7, 4567, "Ben");
		Student Bob = new Student(1.7, 5678, "Bob");

		ArrayList<Student> StudentList= new ArrayList<Student>();
		StudentList.add(Yash);
		StudentList.add(Kartik);
		StudentList.add(Ben);
		StudentList.add(Misha);
		StudentList.add(Bob);
		print(StudentList);
		System.out.println();
		System.out.println("After Sorting:");
		sortStudent(StudentList);
		print(StudentList);
		
	}

	private static void sortStudent(ArrayList<Student> studentList) {
		int min_index;
		for (int i=0; i<studentList.size(); i++) {
			min_index=i;
			for(int j=i+1;j<studentList.size();j++) {
				Student s1=studentList.get(j);
				Student s2=studentList.get(min_index);
				if(s1.getGpa()<s2.getGpa()) {
					min_index=j;
				}else if(s1.getGpa()==s2.getGpa()) {
					if(s1.getName().compareToIgnoreCase(s2.getName())<0) {
						min_index=0;
					}else if(s1.getName().contentEquals(s2.getName())) {
						if(s1.getId()<s2.getId()) {
							min_index=j;
						}
					}
				}
			}
			if(i!=min_index) {
				Student temp=studentList.get(i);
				studentList.set(i,studentList.get(min_index));
				studentList.set(min_index, temp);
			}
		}
		
	}

	private static void print(ArrayList<Student> studentList) {
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i).getGpa()+" "+studentList.get(i).getName()+" "+studentList.get(i).getId());
		}
		
	}

}

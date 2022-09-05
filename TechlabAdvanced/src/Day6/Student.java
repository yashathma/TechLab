package Day6;

public class Student {
private double gpa;
private int id;
private String name;

public Student(double gpa, int id, String name) {
	this.gpa=gpa;
	this.id=id;
	this.name=name;
}

public double getGpa() {
	return gpa;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
	

}

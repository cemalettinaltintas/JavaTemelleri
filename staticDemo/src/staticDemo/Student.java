package staticDemo;

import java.util.List;
public class Student {
	private String name;
	private int id,point;
	private static int counter=0;
	public Student(String name, int id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
		Student.counter++;
	}
	public String getName() {return name;}
	public int getId() {return id;}
	public int getPoint() {
		return point;
	}
	public static int getCounter() {
		return counter;
	}
	
	public void exit() {
		Student.counter--;
	}
	
	public static double ortalamaHesapla(List<Student> students) {
		double total=0;
		
		for (Student student : students) {
			total+=student.getPoint();
		}
		return total/students.size();
	}
}

package staticDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Online student : "+Student.getCounter());//0
		
		Student s1=new Student("Emircan", 1, 50);
		Student s2=new Student("Alp", 2, 100);
		Student s3=new Student("Nisa", 3, 60);

		System.out.println("Online student : "+Student.getCounter());//3
		
		s1.exit();
		System.out.println("Online student : "+Student.getCounter());//2
		
		List<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		
		System.out.println(Student.ortalamaHesapla(students));
	}

}

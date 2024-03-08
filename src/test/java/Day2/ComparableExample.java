package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 class Student implements Comparable<Student> {
	String name;
	int age;
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "age="+age+"name="+name;
	}
	
	public int compareTo(Student t) {
		
		if (this.age>t.age)
			return 1;
		else
			return -1;
	}

	}

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Student>stud= new ArrayList<>();
		stud.add(new Student("test",21));
		stud.add(new Student("test1",11));
Collections.sort(stud);
System.out.println(stud);
	}

}

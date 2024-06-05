package testingWithTDD;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
	private Map<Integer, Student> stdMap=new HashMap<>();
	public void addStudent(Student student) {
		stdMap.put(student.getID(), student);
	}
	public Student getStudent(int id) {
		return stdMap.get(id);
	}
	void updateStudentBranch(int id, String newBranch) {
		Student student=stdMap.get(id);
		if(student != null) {
			stdMap.put(id, new Student(id, student.getName(), newBranch));
		}
	}

}

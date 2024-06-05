package testingWithTDD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class StudentTest {
	
	StudentService studentService=new StudentService();
	Student student=new Student(1, "Gedam Subhash", "Computer Science");
	@Test
	public void testAddAndGetStudent() {
		studentService.addStudent(student);
		Student retrivedStudent=studentService.getStudent(1);
		assertNotNull(retrivedStudent);
		assertEquals(1, retrivedStudent.getID());
		assertEquals("Gedam Subhash", retrivedStudent.getName());
		assertEquals("Computer Science", retrivedStudent.getBranch());	
	}
	@Test
	public void testUpdateStudentBranch() {
		StudentService studentService=new StudentService();
		Student student=new Student(1, "Gedam Subhash", "Computer Science");
		studentService.addStudent(student);
		studentService.updateStudentBranch(1, "Electrical Engineering");
		Student updateStudent=studentService.getStudent(1);
		assertNotNull(updateStudent);
		assertEquals("Electrical Engineering", updateStudent.getBranch());
	}
	
}

package mockitoDemo.studentsTest;

import org.mockito.Mockito;

import mockitoDemo.students.Student;
import mockitoDemo.students.StudentResource;
import mockitoDemo.students.StudentService;
 

public class resourceTest {
	StudentResource studentResource;
	StudentService studentService;
	
	public static void main(String[] args) {
		resourceTest Test = new resourceTest();
		Test.setup();
		Test.shouldSaveStudent();
	}
	public void setup() {
		studentService = Mockito.mock(StudentService.class);
		studentResource = new StudentResource(studentService);
	}
	
	public void shouldSaveStudent() {
		Student student = new Student("john", 19, "24 south LA");
		Mockito.when(studentService.saveStudent(student)).thenReturn(1)	;
		int Result= studentResource.saveStudent("john", 19, "24 south LA");
		if(Result==1) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}

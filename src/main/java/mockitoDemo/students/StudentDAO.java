package mockitoDemo.students;
import java.util.HashMap;
import java.util.Map;

public class StudentDAO {
	static int i = 1;
	Map<Integer,Student> studentStore = new HashMap<Integer,Student>();	
	
	public int save(Student student) {
		studentStore.put(i,student);
		return i++;
	}

}

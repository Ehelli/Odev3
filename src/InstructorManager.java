
public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getUserName()+" added");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getUserName()+" erased");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getUserName()+" updated");
	}
}
public class Main {

	public static void main(String[] args) {
		
		User user=new User(82,"Lana Del"," Rey", "LanaDelRey","11258llk");
		UserManager userManager=new UserManager();
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);
		
		System.out.println("						");
		System.out.println(":):):):):):):):):):):):):)");
		System.out.println("						");
		
		Instructor instructor=new Instructor();
		instructor.id=596;
		instructor.firsName="jason";
		instructor.lastName="derulo";
		instructor.userName="JasonDerulo";
		instructor.password="1234888po";
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		
		System.out.println("						");
		System.out.println(":):):):):):):):):):):):):)");
		System.out.println("						");
		
		Student student=new Student(259, "Dua", "Lipa", "DuaLipa", "789555", "Java & React");
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		
		
	}

}

    class Student extends User {
	String lesson;

	public Student(int id, String firsName, String lastName, String userName, String password, String lesson) {
		super(id, firsName, lastName, userName, password);
		this.lesson = lesson;
	}

	public String getlesson() {
		return lesson;
	}

	public void setlesson(String lesson) {
		this.lesson = lesson;
	}
	
}
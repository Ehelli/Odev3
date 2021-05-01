
    public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getUserName() + " added");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " erased");
	}
	
	public void update(User user) {
		System.out.println(user.getUserName()+" updated");
	}
}
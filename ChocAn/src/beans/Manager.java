package beans;

public class Manager extends User{

	public static final int UNSUCCESSFUL_INSERT = -1;
	public static final int SUCCESSFUL_INSERT = 0;
	
	private int fkIdManager;
	private User user;
	
	public Manager(){}
	
	public Manager(
			int fkIdManager,
			User user
			){
		this.fkIdManager = fkIdManager;
		this.user = user;
	}
	
	public int printWeeklyReports() {
		return 0;
	}

	public int getFkIdManager() {
		return fkIdManager;
	}

	public void setFkIdManager(int fkIdManager) {
		this.fkIdManager = fkIdManager;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
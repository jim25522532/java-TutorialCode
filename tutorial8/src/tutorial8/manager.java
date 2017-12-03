package tutorial8;

public class manager extends Employee{
	public manager(String name, String address, int number) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
	}
	private int Permissions;
	private String job;
	private int salary;
	
	public void setPermissions(int permissions) {
		Permissions = permissions;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	} 
	public static void main(String[] args) {
		manager boss = new manager("¤ý¸³","¥x¥_",1);
		boss.setPermissions(1);
		
	}
}

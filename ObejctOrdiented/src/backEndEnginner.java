

public class backEndEnginner extends Employee{
	private String job; // dataScientist��¾�d
	public backEndEnginner(String name, String address, int number, String job) {
	      super(name, address, number);
	      setJob(job);
	   }
	
	public static void main(String[] args) {
		
	
	}
	public void doJob() {
		System.out.println("��ݤu�{�v");
	}
	public void setJob(String job) {
		this.job = job;
	}
}

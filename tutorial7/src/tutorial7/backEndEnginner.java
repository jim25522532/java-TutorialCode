package tutorial7;

public class backEndEnginner extends Employee{
	private String job; // dataScientist的職責
	public backEndEnginner(String name, String address, int number, String job) {
	      super(name, address, number);
	      setJob(job);
	   }
	public void doJob() {
		System.out.println("後端工程師");
	}
	public void setJob(String job) {
		this.job = job;
	}
}

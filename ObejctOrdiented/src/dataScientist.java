

public class dataScientist extends Employee{
	private String job; // dataScientist的職責
	public dataScientist(String name, String address, int number, String job) {
	      super(name, address, number);
	      setJob(job);
	   }
	public void doJob() {
		System.out.println("資料分析");
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}



public class dataScientist extends Employee{
	private String job; // dataScientist��¾�d
	public dataScientist(String name, String address, int number, String job) {
	      super(name, address, number);
	      setJob(job);
	   }
	public void doJob() {
		System.out.println("��Ƥ��R");
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}

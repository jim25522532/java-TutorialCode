
public class Employee extends Department{
	//�ϰ��ܼ�
	String job; //job:�ϰ즨�����ܼ�
	int old = 10;
	//job2 :���main �������ݩ�
	//�����ܼ�
	static String job2 = "�u�{�v";
	final static int salary = 10000000;
	
	
	static int scores = 100;
	
	public static void main(String[] args) {
		
		System.out.println("�u�{�v�~��"+salary);
		// TODO Auto-generated method stub
		Employee people = new Employee();
		Employee secondPeople = new Employee();
		System.out.println(people.employee_no);
		
		
//		people.setPeoplOld(18);
//		System.out.println("people.old:"+people.old);
//		System.out.println("secondPeople.old:"+secondPeople.old);
//		people.move();
//		people.setPeoplOld(33);
		
//		System.out.println(people.setPeoplOld(33));
//		System.out.println(secondPeople.old);
		findMax(10,15);
	
	}
	
	public void pushMission(String job) {
		this.job = job;
	}
	public static void findMax(int a,int b) {
	
		if(a>b) {
			findMax(a,b);
			return;
		}
		else {
			return;
		}

	}
	
	public void move() {
		System.out.println("�ڷ|����");
	}
	
	public int setPeoplOld(int old) {
		this.old = old;
		return this.old;
		//this.old�O��e������
		//old�O�ǤJ���Ѽ�
	}
	/**
	 * �S���^�ǭȪ���k
	 * @param text
	 */
	public static void replaceJob(String text) {
		text = "456";
	}
	
	
	/*
	 * 
	 * ���^�ǭȪ���k
	 */
	public static String replaceJob2(String text) {
		return "456";
	}
//	
//	public static void replaceLocalJob(String text) {
//		text = "�{���]�p�v";
//	}
//	
//	public static void replaceLocalJob(String text) {
//		text = "�{���]�p�v";
//	}
}

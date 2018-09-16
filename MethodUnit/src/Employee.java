
public class Employee extends Department{
	//區域變數
	String job; //job:區域成員的變數
	int old = 10;
	//job2 :整個main 都有的屬性
	//全域變數
	static String job2 = "工程師";
	final static int salary = 10000000;
	
	
	static int scores = 100;
	
	public static void main(String[] args) {
		
		System.out.println("工程師薪水"+salary);
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
		System.out.println("我會移動");
	}
	
	public int setPeoplOld(int old) {
		this.old = old;
		return this.old;
		//this.old是當前的物件
		//old是傳入的參數
	}
	/**
	 * 沒有回傳值的方法
	 * @param text
	 */
	public static void replaceJob(String text) {
		text = "456";
	}
	
	
	/*
	 * 
	 * 有回傳值的方法
	 */
	public static String replaceJob2(String text) {
		return "456";
	}
//	
//	public static void replaceLocalJob(String text) {
//		text = "程式設計師";
//	}
//	
//	public static void replaceLocalJob(String text) {
//		text = "程式設計師";
//	}
}

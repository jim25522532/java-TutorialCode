package tutorial6;

public class student {
	private int studentNo;
	private int score;
	private String chinese;
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getChinese() {
		return chinese;
	}
	
	public void setChinese(String chinese) {
		this.chinese = chinese;
	}
	
	public static void main(String[] args) {
		student amy = new student();
		student peter = new student();
		amy.setChinese("amy");
		amy.setScore(100);
		amy.setStudentNo(1);
		System.out.println("amy.name"+amy.getChinese());
		System.out.println("amy.score"+amy.getScore());
		System.out.println("amy.studentNo"+amy.getStudentNo());
		peter.setChinese("peter");
		peter.setScore(60);
		peter.setStudentNo(2);
		System.out.println("peter.name"+peter.getChinese());
		System.out.println("peter.score"+peter.getScore());
		System.out.println("peter.studentNo"+peter.getStudentNo());
		
		//student
//		System.out.println("student"+student);
	} 
}

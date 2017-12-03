package tutorial8;



public class tutorial8 {
	static int year = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(year); //這裡會顯示在class中宣告的year數值
		year = countYear();
		System.out.println(year);
	}
	public static int countYear(){
		System.out.println(year); //這邊是顯示tutorial8類別中宣告的year變數
		int year = 20; //在這邊重新宣告了一個變數名稱一樣為year且數值為20
		return year;
	}
}

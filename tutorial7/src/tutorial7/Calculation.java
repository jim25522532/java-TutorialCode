package tutorial7;

/**
 * 
 * 計算機類別
 * @author User
 *
 */
public class Calculation {
	int z;
	/**
	 * 
	 * 計算機中有兩個方法一個是加法函數一個是減法函數
	 * @param x
	 * @param y
	 */
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("兩個數字和為:"+z);
	}
		
	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("兩個數字的差為:"+z);
	}
}


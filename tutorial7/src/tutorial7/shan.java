package tutorial7;

public class shan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 旋轉
		 * 以下為矩陣的index
		 * 00 01 02
		 * 10 11 12
		 *   
		 * 
		 * 逆時針旋轉後變成
		 * 
		 * 00 10
		 * 01 11
		 * 02 12
		 * 
		 * 仔細觀察 當旋轉第一次的時候 
		 * 陣列中的位置如何改變
		 * 再將改變的邏輯撰寫成程式
		 * 我們可以看到 00 01 02 變成了 高
		 * 
		 */
		int [][] arr = {{3,1,2},{8,5,4}};
		int [][] temp =new int[arr[0].length][arr.length];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[i][j] = arr[j][i];
				System.out.print(temp[i][j]);
			}
			System.out.print("\n");
		}
	}

}

package tutorial8;

public class fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= new int[3][2];
		arr[0][0]=3;
		arr[0][1]=6;
		arr[1][0]=2;
		arr[1][1]=5;
		arr[2][0]=1;
		arr[2][1]=4;
		arr = funArr(arr);
		for(int i=0;i<arr.length;i++) { 
			//找出長度行要做的次數
			for(int j=0;j<arr[0].length;j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static int[][] funArr(int[][] arr){
//		int [][] arrTemp= arr; //注意!!千萬不能這樣做,否則你將永遠不知道發生什麼事,試著將每次結果輸出,了解程式如何運作 
		int [][] arrTemp = new int[arr.length][arr[0].length]; //我們要產生新的一個空間,獨立的暫存空間,不能跟arr的參考位置相同
		//請思考為何要用new 產生在記憶體中在建立一個arrTemp陣列變數空間
		if(arr.length<2) {
			return arr;
		}
		else if(arr.length>2) {
			//初始化暫存空間的陣列
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					arrTemp[i][j] = arr[i][j];
				}
			}
			//找出高度/2就是我們要做的高度次數
			for(int i=0;i<arr.length/2;i++) {		
				//找出長度行要做的次數
				for(int j=0;j<arr[0].length;j++) {

					arr[i][j] = arrTemp[arr.length-1-i][j];
					arr[arr[0].length-i][j] = arrTemp[i][j];

				}
			}
		}
		return arr; //回傳arr名稱陣列
	}

}

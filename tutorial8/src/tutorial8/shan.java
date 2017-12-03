package tutorial8;

public class shan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= new int[3][2];
		arr[0][0]=3;
		arr[0][1]=6;
		arr[1][0]=2;
		arr[1][1]=5;
		arr[2][0]=1;
		arr[2][1]=4;
		//高度不同旋轉後會變成寬度>高度不能由arr陣列去接受此回傳值
		int [][] shanAfter = new int[2][3];
		shanAfter = shan(arr);
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(shanAfter[i][j]);
			}
		}
	}
	public static int[][] shan(int[][] shanArr) {
		int [][] shanAfter = new int[2][3];
		//如何取高度的長度?
		//取陣列高度shanArr.length 會得到3

		//旋轉後高度設定次數
		for(int j=0;j<=shanAfter.length;j++) {
			//這邊要做旋轉後寬度有幾個設定
			for(int i=0;i<shanArr.length-1;i++) {
				//右邊是原本的值		
				shanAfter[i][shanAfter.length-j] = shanArr[j][i];//將旋轉數值做交換		
			}

		}
		return shanAfter;
	}

}

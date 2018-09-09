package tutorial8;

import java.util.Scanner;
/**
 * 2018-09-09矩陣轉置
 * 作業三
 * @author chengHai
 *
 */
public class shan2 {

	public static void main(String[] args) {

		//高度不同旋轉後會變成寬度>高度不能由arr陣列去接受此回傳值
		Scanner input = new Scanner(System.in);
		
		int row = input.nextInt(); //高
		int col = input.nextInt();//欄
		
		
		int [][] arr= new int[row][col]; //原矩陣
		
		/**
		 * 輸入矩陣內的數值
		 */
		 for(int i=0;i<row;i++) {
//			 System.out.println("i"+i);
			 for(int j=0;j<col;j++){  
//				 System.out.println("j"+j);
				 arr[i][j] = input.nextInt();  
             }  
		 }
		 shan(arr,row,col);
//		 for(int i=0;i<col;i++){  
//             for(int j=0;j<row;j++){  
//            	 System.out.print(" "+arr[j][i]); //讓每個矩陣中+一個空白
//             }  
//             System.out.println();  
//         }  
		
		
	}
	public static void shan(int[][] arr,int row,int col) {

		
		 for(int i=0;i<col;i++){  
             for(int j=0;j<row;j++){  
            	 System.out.print(" "+arr[j][i]); //讓每個矩陣中+一個空白
             }  
             System.out.println();  
         }  
	}

}

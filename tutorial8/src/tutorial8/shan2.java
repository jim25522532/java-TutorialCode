package tutorial8;

import java.util.Scanner;
/**
 * 2018-09-09�x�}��m
 * �@�~�T
 * @author chengHai
 *
 */
public class shan2 {

	public static void main(String[] args) {

		//���פ��P�����|�ܦ��e��>���פ����arr�}�C�h�������^�ǭ�
		Scanner input = new Scanner(System.in);
		
		int row = input.nextInt(); //��
		int col = input.nextInt();//��
		
		
		int [][] arr= new int[row][col]; //��x�}
		
		/**
		 * ��J�x�}�����ƭ�
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
//            	 System.out.print(" "+arr[j][i]); //���C�ӯx�}��+�@�Ӫť�
//             }  
//             System.out.println();  
//         }  
		
		
	}
	public static void shan(int[][] arr,int row,int col) {

		
		 for(int i=0;i<col;i++){  
             for(int j=0;j<row;j++){  
            	 System.out.print(" "+arr[j][i]); //���C�ӯx�}��+�@�Ӫť�
             }  
             System.out.println();  
         }  
	}

}

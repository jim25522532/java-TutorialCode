package tutorial7;

public class shan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ����
		 * �H�U���x�}��index
		 * 00 01 02
		 * 10 11 12
		 *   
		 * 
		 * �f�ɰw������ܦ�
		 * 
		 * 00 10
		 * 01 11
		 * 02 12
		 * 
		 * �J���[�� �����Ĥ@�����ɭ� 
		 * �}�C������m�p�����
		 * �A�N���ܪ��޿輶�g���{��
		 * �ڭ̥i�H�ݨ� 00 01 02 �ܦ��F ��
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

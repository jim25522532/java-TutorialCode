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
			//��X���צ�n��������
			for(int j=0;j<arr[0].length;j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static int[][] funArr(int[][] arr){
//		int [][] arrTemp= arr; //�`�N!!�d�U����o�˰�,�_�h�A�N�û������D�o�ͤ����,�յ۱N�C�����G��X,�F�ѵ{���p��B�@ 
		int [][] arrTemp = new int[arr.length][arr[0].length]; //�ڭ̭n���ͷs���@�ӪŶ�,�W�ߪ��Ȧs�Ŷ�,�����arr���ѦҦ�m�ۦP
		//�Ы�Ҭ���n��new ���ͦb�O���餤�b�إߤ@��arrTemp�}�C�ܼƪŶ�
		if(arr.length<2) {
			return arr;
		}
		else if(arr.length>2) {
			//��l�ƼȦs�Ŷ����}�C
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					arrTemp[i][j] = arr[i][j];
				}
			}
			//��X����/2�N�O�ڭ̭n�������צ���
			for(int i=0;i<arr.length/2;i++) {		
				//��X���צ�n��������
				for(int j=0;j<arr[0].length;j++) {

					arr[i][j] = arrTemp[arr.length-1-i][j];
					arr[arr[0].length-i][j] = arrTemp[i][j];

				}
			}
		}
		return arr; //�^��arr�W�ٰ}�C
	}

}

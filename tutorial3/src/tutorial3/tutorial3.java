package tutorial3;

import java.util.Scanner;

public class tutorial3 {
	public static void main(String[] args) {
		//if�ԭz
		int a=5,b=4;
		if(true) {
			System.out.println("�ڶi���o");//��()������F�O���u,�h�|�i�Jif�ԭz��
		}
		//��if��������F��
		if(a>b) {
			System.out.println("a>b���P�_���߷|�o��true�����G");
			//a>b�����G���߷|�o��true�����G,��i�Jif�ԭz
		}
		//�޿�B��l���X
		if(a>b && a>6) {
			System.out.println("a>b �B a�n�j��6�~�|�i��"); //&&�������B�⦡���G�n���u
		}
		else {
			System.out.println("��if���󤣦���,�h�|��else�����ԭz");//�ڬOelse
		}
		
		Scanner sc= new Scanner(System.in);
//		int year = sc.nextInt();
		//�P�_�O�_���|�~
//		if(year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println("�|�~");
//		}
//		else {
//			System.out.println("���~");
//		}
		int score = sc.nextInt();
		switch(score/10){
			case 10:
				System.out.println("S");
			case 9:
				System.out.println("S");
				break;
			case 8:
				System.out.println("A");
				break;
			case 7:
				System.out.println("B");
				break;
			case 6:
				System.out.println("C");
				break;
			default:
				System.out.println("���ή�");
				break;
		}
	}
}

package tutorial7;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("�п�J�����");
		int n = N.nextInt();
		        int k = 2;
		      //�qk�}�l��
		        int count =0 ; //�p��
		        System.out.printf("%d�]�����Ѭ� : ",n);
		        if(n<=1)
		        System.out.printf("%S","���ƨS�]��");
		        else if(n == 2)
		        System.out.print("1*2");
		        else{  //�Ʀr��2�H�W�}�l������
		do{
		if(n%k == 0){
		while(n%k == 0){
		n/=k;
		count++;//������p��
		}
		if(count == 1)  //���謰1,����^
		System.out.print(k+"*");
		else
		System.out.print(k+"^"+count+"*");
		count=0; }
		   else //����㰣�h,����k�b�[1
		            k++;
		}while(k < n);
		System.out.print(n);//�̫���ѧ�����
		}
		
	}

}

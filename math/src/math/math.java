package math;

public class math{
	   public int add(int a,int b){
	     return a+b;  
	   }
	   public static int SUB(int a, int b){
	     return a-b;
	   }
	  public static void main(String args[]){
	     math caluation = new math();//�ڭ̻ݭn�Nmath�������
	     //���O��static��k�|�b�{���@���檺�ɭԴN���ڭ̲���  
	     //ex
	     System.out.println(SUB(1,2));
	     System.out.println(caluation.SUB(1, 2));
	  }
	}


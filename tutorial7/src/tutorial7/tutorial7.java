package tutorial7;

import java.util.Scanner;

public class tutorial7 {
  public static void main(String args[]) {
	  //�Ĥ@�D if else�����D
	  /**
	   * 1.��weather������rain �BmyMoney=1001,�аݵ{���|��X��ص��G�H
           ex: weather cloud mymoney=1001
         2.��weather����snow �B�@myMoney=2000 
         3.��weather����rain �B�@myMoney=2000
         4.��weather����sunny �B�@myMoney=2000   
	   */
//	  String weather ="";
//	  int myMoney=1001;
//	  if(weather !="rain" && myMoney>1000){
//	       System.out.println("�ݹq�v");
//	    }
//	    else{
//	       System.out.println("�v�b�a");
//	    }
	  /**
	   * �ĤG�D
	   * int huihuiMoney=150;
	   * int dumpling = 100;
	   * int steak = 300;
	   * int buffer  = 120;
	   * int steakNoodle 200;
	   */
//	  int huihuiMoney=150;
//	  int dumpling = 100;
//	  int steak = 300;
//	  int buffer  = 120;
//	  int steakNoodle =200;
//	  if(huihuiMoney>dumpling) {
//		  System.out.println("�i�H�Y����");
//	  }
//	  if(huihuiMoney>steak) {
//		  System.out.println("�i�H�Y����");
//	  }
//	  if(huihuiMoney>buffer) {
//		  System.out.println("�i�H�Y�ۧU�\");
//	  }
//	  if(huihuiMoney>steakNoodle) {
//		  System.out.println("�i�H�Y������");
//	  }
	  /**
	   * ���r��T����
	   * �ϥ�for�j�鰵���D�Y�i
	   * i,j,k���B�z�ƭȪ��ܼ� �L�S�O�N�q
	   * i������j�鶥�h����
	   * k������C�Ӷ��h���ťզr��
	   * j������*��X������
	   */
	  int n=6;
	  //���X������
	  for(int i=1;i<=n;i=i+1) {
		  //�C���n��X�X�Ӫť�
		  for(int k=(n-i);k>0;k--) {
			  System.out.print(" ");
		  }
		  //�C���n��X�X��*����
		  for(int j=1;j<i*2;j++){
			  System.out.print("*");
		  }
		  System.out.print("\n");
	  }
	  /**
	   * �r��j��
       * ��Ҧr����רC�����q
       * ��Ҧp��i�H�W�[�P�_���t��
       * �p����D�r�����e��m���r���ð�if�P�_
	   */
	  String text="abcba";
	  boolean isPalid = true;
	  for(int i=0;i<text.length()/2;i++) {
		  if(text.charAt(i)!=text.charAt(text.length()-1-i)) {
			  isPalid=false;
		  }
		 
	  }
	  System.out.print(isPalid);
	  
	  
	  /**
	   * ���ƭ^��r��
	   * 
	   */
	  text="abacaa";
	  int chara=0;
	  int charb=0;
	  int charc=0;
	  int chard=0;
	  for(int i=0;i<text.length();i++) {
		  switch(text.charAt(i)) {
		  case 'a':chara=chara+1;break;
		  case 'b':charb=charb+1;break;
		  case 'c':charc=charc+1;break;
		  case 'd':chard=chard+1;break;
		  }
	  }
	  System.out.println("a����:"+chara+"��");
	  System.out.println("a����:"+charb+"��");
	  System.out.println("a����:"+charc+"��");
	  System.out.println("a����:"+chard+"��");
	  /**
	   * ���ƭ^��r��
	   * �ܤ��D-���w�r���P��J�r��
	   * 
	   */
	  
//	  Scanner sc = new Scanner(System.in);
//	  text=sc.nextLine();
//	  char wantChar = sc.next().charAt(0);	
//	  int repeat=0;
//	  for(int i=0;i<text.length();i++) {
//		  if(text.charAt(i)==wantChar) {
//			  repeat++;
//		  }
//	  }
//	  System.out.println(wantChar+"����"+repeat+"��");
	  /**
	   * �D��:�j�ƹB��
	   * �j�ƹB��ΰ}�C�Ϊ̥Φr��s�ƭ�
	   * �p��a/b�l�ƨ�p���I��10��
	   */
//	  int a=18467,b=41,c=10;
//	  int number = a/b;
//	  int tempNumber = 0;
//	  String textNumber = "";
//	  for(int i=1;i<=10;i++) {
//		  tempNumber =a%b*10;
//		  System.out.print(tempNumber);
//	  }
	  /**
	   * �D�̤j���]��
	   * �Q����=i,����=48
	   * k=swapValue=0
	   *    1|76 | 48|1  �Ĥ@�� swapValue = 28,a=48,b=28
	   *     |48 | 28|  �ĤG�� swapValue = 20,a=28,b=20
	   *     ------------  
	        1|28 |20|2  �ĤT��   swapValue = 8 ,a=20 b=8
  	         |20 |16|  �ĥ|��   swapValue = 4 ,a=8  b=4
	         --------
	        2| 8 | 4| ->>>>4���̤j���]�� �Ĥ��� swapValue = 0 a=4 ,b=0 b==0�{������
	           8
	         ---------
	           0 ->>>>�l�Ƭ�0         
	   */
//	  int a=76,b=48,swapValue=0;
//	  
//	  while(b!=0){
//		    swapValue = a%b;
//          a=b;
//          b=swapValue;
//		  
//		  
//		}
//	  System.out.println("�̤j���]��"+a);
//	  int sum;
//	  int [] arr = new int[10];
//
//	  for(int i=0;i<10;i=i+1){
//	    arr[i]=i;
//	  }
//	  sum = 0;
//	  for(int i=1;i<9;i=i+1)
//	    sum = sum - arr[i-1] + arr[i] + arr[i+1];
//	  
//	  System.out.println(sum);
	  int[] class1Score = {90, 85, 55, 94, 77};
	  int[] class2Score = {11, 23, 24, 65, 77};
	  int[] classMergeClass = new int[class1Score.length+class2Score.length];
	  int maxVal=class1Score[0];
	  int maxIndex=0;
	  int totalScore1=0;
	  int totalScore2=0;
	  for(int i=1;i<=class1Score.length-1;i++) {
		  if(maxVal<class1Score[i]) {
			  maxVal= class1Score[i];
			  maxIndex = i;
		  }
	  }
	  //�Ĥ@�D
	  System.out.println("class1Score���̤j�Ȭ�"+maxVal+"�b��"+maxIndex+"��m");
	  //�ĤG�D
	  for(int i=0;i<=class1Score.length-1;i++) {
		  totalScore1 +=class1Score[i];
	  }
	  System.out.println("�`����:"+totalScore1);
	  for(int i=0;i<=class2Score.length-1;i++) {
		  totalScore2 +=class2Score[i];
	  }
	  System.out.println("�`����:"+totalScore2);
	  
	  if(totalScore1>totalScore2) {
		  System.out.println("class1Score�Ĥ@�W");
	  }
	  else {
		  System.out.println("class2Score �Ĥ@�W");
	  }
	  //�ĤT�D
      int flag=0;
	  for(;flag<class1Score.length;flag++) {
		  classMergeClass[flag] = class1Score[flag];	  
	  }
	  for(int i=0;i<class2Score.length;i++) {
		  classMergeClass[flag++] = class1Score[i];
	  }
	  for(int i=0;i<classMergeClass.length;i++) {
		  System.out.println(classMergeClass[i]);
	  }
	  
	  
  }

}

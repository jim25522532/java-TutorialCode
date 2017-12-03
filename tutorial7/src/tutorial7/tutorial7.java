package tutorial7;

import java.util.Scanner;

public class tutorial7 {
  public static void main(String args[]) {
	  //第一題 if else情境題
	  /**
	   * 1.當weather不等於rain 且myMoney=1001,請問程式會輸出何種結果？
           ex: weather cloud mymoney=1001
         2.當weather等於snow 且　myMoney=2000 
         3.當weather等於rain 且　myMoney=2000
         4.當weather等於sunny 且　myMoney=2000   
	   */
//	  String weather ="";
//	  int myMoney=1001;
//	  if(weather !="rain" && myMoney>1000){
//	       System.out.println("看電影");
//	    }
//	    else{
//	       System.out.println("宅在家");
//	    }
	  /**
	   * 第二題
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
//		  System.out.println("可以吃水餃");
//	  }
//	  if(huihuiMoney>steak) {
//		  System.out.println("可以吃牛排");
//	  }
//	  if(huihuiMoney>buffer) {
//		  System.out.println("可以吃自助餐");
//	  }
//	  if(huihuiMoney>steakNoodle) {
//		  System.out.println("可以吃牛肉麵");
//	  }
	  /**
	   * 金字塔三角形
	   * 使用for迴圈做解題即可
	   * i,j,k為處理數值的變數 無特別意義
	   * i為控制迴圈階層次數
	   * k為控制每個階層的空白字元
	   * j為控制*輸出的次數
	   */
	  int n=6;
	  //做幾次控制
	  for(int i=1;i<=n;i=i+1) {
		  //每次要輸出幾個空白
		  for(int k=(n-i);k>0;k--) {
			  System.out.print(" ");
		  }
		  //每次要輸出幾個*控制
		  for(int j=1;j<i*2;j++){
			  System.out.print("*");
		  }
		  System.out.print("\n");
	  }
	  /**
	   * 字串迴文
       * 思考字串長度每次的量
       * 思考如何可以增加判斷的速度
       * 如何取道字串對於當前位置的字元並做if判斷
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
	   * 重複英文字母
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
	  System.out.println("a重複:"+chara+"次");
	  System.out.println("a重複:"+charb+"次");
	  System.out.println("a重複:"+charc+"次");
	  System.out.println("a重複:"+chard+"次");
	  /**
	   * 重複英文字母
	   * 變化題-指定字母與輸入字串
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
//	  System.out.println(wantChar+"重複"+repeat+"次");
	  /**
	   * 題目:大數運算
	   * 大數運算用陣列或者用字串存數值
	   * 計算a/b餘數到小數點第10位
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
	   * 求最大公因數
	   * 被除數=i,除數=48
	   * k=swapValue=0
	   *    1|76 | 48|1  第一次 swapValue = 28,a=48,b=28
	   *     |48 | 28|  第二次 swapValue = 20,a=28,b=20
	   *     ------------  
	        1|28 |20|2  第三次   swapValue = 8 ,a=20 b=8
  	         |20 |16|  第四次   swapValue = 4 ,a=8  b=4
	         --------
	        2| 8 | 4| ->>>>4為最大公因數 第五次 swapValue = 0 a=4 ,b=0 b==0程式結束
	           8
	         ---------
	           0 ->>>>餘數為0         
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
//	  System.out.println("最大公因數"+a);
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
	  //第一題
	  System.out.println("class1Score中最大值為"+maxVal+"在第"+maxIndex+"位置");
	  //第二題
	  for(int i=0;i<=class1Score.length-1;i++) {
		  totalScore1 +=class1Score[i];
	  }
	  System.out.println("總分為:"+totalScore1);
	  for(int i=0;i<=class2Score.length-1;i++) {
		  totalScore2 +=class2Score[i];
	  }
	  System.out.println("總分為:"+totalScore2);
	  
	  if(totalScore1>totalScore2) {
		  System.out.println("class1Score第一名");
	  }
	  else {
		  System.out.println("class2Score 第一名");
	  }
	  //第三題
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

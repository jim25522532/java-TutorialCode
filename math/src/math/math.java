package math;

public class math{
	   public int add(int a,int b){
	     return a+b;  
	   }
	   public static int SUB(int a, int b){
	     return a-b;
	   }
	  public static void main(String args[]){
	     math caluation = new math();//我們需要將math給實體化
	     //類別中static方法會在程式一執行的時候就幫我們產生  
	     //ex
	     System.out.println(SUB(1,2));
	     System.out.println(caluation.SUB(1, 2));
	  }
	}


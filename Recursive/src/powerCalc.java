

public class powerCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.0;
		System.out.println(powerCalc(x,4));

	}
	static double powerCalc(double x,int n){
	
	  if(n>0){
		  System.out.println(x+"*powerCalc("+x+","+n+"-1);");
	      return x*powerCalc(x,n-1); //遞迴呼叫powerCalc自己本身
	  } 
	  else if(n<0){
		  System.out.println("n<0 return 1.0/powerCalc("+x+","+-n);
	      return 1.0/powerCalc(x,-n);  
	   }
	  else{
		  System.out.println("n==0 or n<=1 "+n+" x:"+x);
	      return n == 0 ? 1.0 : x;
	   }
	}

	    

}

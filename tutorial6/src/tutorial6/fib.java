package tutorial6;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(1)); //當引數帶入0 or1 將直接輸出 1的輸出值
	    System.out.println(Fibonacci(100)); //當引數帶入4時,我們來看一下流程

	}
	public static int Fibonacci(int n){
	    if(n==0 || n==1) {
	       System.out.println("n=:"+n);
	       return n ;
	    }
	    else{
	       System.out.println("Fibonacci("+n+"-1)"+"Fibonacci("+n+"-2);");
	       return Fibonacci(n-1)+Fibonacci(n-2);
	  }
	}
}

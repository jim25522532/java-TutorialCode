package tutorial6;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(1)); //��޼Ʊa�J0 or1 �N������X 1����X��
	    System.out.println(Fibonacci(100)); //��޼Ʊa�J4��,�ڭ̨Ӭݤ@�U�y�{

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

import java.util.Scanner;

/**
 * ―程そ计籔
 * 程そ计
 * @author chengHai
 *
 */
public class Gcd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("块ㄢ计: ");
		int m = input.nextInt();
		int n = input.nextInt();

		// Calucate and display the GCD
		System.out.println(m+"籔"+n+"程そ计"+gcd(m,n));

	}
	
	/** Method for computing GCD */
	public static int gcd(int m, int n) {
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		if (m % n == 0)
			return n; // 讽m,nユ传 埃緇计0 n程そ计
		else //患癹
			return gcd(n, m % n);
	}
	

}

package tutorial7;

public class identifierCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id= "S154287863";
		int sum=0;
		int [] city= {1,10,19,28,37,46,55,64,39,73,82,2,11,
		            20,48,29,38,47,56,65,74,83,21,3,12,30};
		id = id.toUpperCase();
		System.out.println(id.charAt(0)-65);
		System.out.println(city[id.charAt(0)-65]);
		sum = city[id.charAt(0)-65];

		
		for(int i=1;i<=8;i++) {
			sum +=Integer.valueOf(id.charAt(i)-48)*(9-i);
		}
		sum +=Integer.valueOf(id.charAt(9)-48);
		if(sum%10==0) {
			System.out.println("real");
		}
		else {
			System.out.println("fake");
		}
		
	}

}

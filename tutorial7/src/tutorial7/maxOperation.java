package tutorial7;

public class maxOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=18467,b=41,n=10,q,r;
		
		
	    int [] arr = new int[100]; //可以存100個數在陣列空間
	    //q,r為暫存轉換的變數使用 原因:好識別
    	q=a/b; //第一次先將整束的商數取出來
        r=a%b; //剩下除不盡的要處理為小數點的數
        System.out.println(r);
		for(int i=0;i<n;i++) {
			arr[i] =(r*10)/b; //我要取每次運算的商數 ex:第一個數值存17
			r=(r*10)%b;       //將17*10在除41的餘數 後 就能繼續運算小數點第二個數值
		}
		System.out.println(q); //q為小數點前的商數
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}

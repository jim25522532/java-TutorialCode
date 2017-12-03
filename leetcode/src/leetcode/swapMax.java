package leetcode;

public class swapMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maximumSwap(int num) {
        if(num<10) {
        	return num;
        }
        else if(num<100) {
        	if(num%10>num/10) {
        		return num%10*10+num/10;
        	}
        	else {
        		return num;
        	}
        }
        else {
        	int [] arr =new int[String.valueOf(num).length()];
        	for(int i=0;i<arr.length;i++) {
        		for(int j=1;j<arr.length-1;j++) {
        			
        		}
        	}
        }
    }
}

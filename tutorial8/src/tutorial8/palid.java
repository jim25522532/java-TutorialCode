package tutorial8;

import java.util.Scanner;

public class palid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text="";
		 Scanner input = new Scanner(System.in);
		 
		 text = input.nextLine();
		  boolean isPalid = true;
		  for(int i=0;i<text.length()/2;i++) {
			  if(text.charAt(i)!=text.charAt(text.length()-1-i)) {
				  isPalid=false;
			  }
			 
		  }
		  System.out.print(isPalid);
	}

}

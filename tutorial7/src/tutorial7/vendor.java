package tutorial7;

public class vendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int greenTea=40,cola=50,water=60,blackTea=70;
		String buyItem= "���";
		int enterMoney=100;
		switch(buyItem) {
		  case "���":
			  if(enterMoney>greenTea) {
				  enterMoney = enterMoney-greenTea;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("���B�����L�k�ʶR"); 
			  }
			  break;
		  case "����":
			  if(enterMoney>blackTea) {
				  enterMoney = enterMoney-blackTea;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("���B�����L�k�ʶR"); 
			  }
			  break;
		  case "�q�u��":
			  if(enterMoney>water) {
				  enterMoney = enterMoney-water;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("���B�����L�k�ʶR"); 
			  }
			  break;
		  case "�i��":
			  if(enterMoney>cola) {
				  enterMoney = enterMoney-cola;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("���B�����L�k�ʶR"); 
			  }
			  break;
		}
	}

}

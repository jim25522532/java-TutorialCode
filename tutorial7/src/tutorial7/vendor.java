package tutorial7;

public class vendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int greenTea=40,cola=50,water=60,blackTea=70;
		String buyItem= "綠茶";
		int enterMoney=100;
		switch(buyItem) {
		  case "綠茶":
			  if(enterMoney>greenTea) {
				  enterMoney = enterMoney-greenTea;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("金額不足無法購買"); 
			  }
			  break;
		  case "紅茶":
			  if(enterMoney>blackTea) {
				  enterMoney = enterMoney-blackTea;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("金額不足無法購買"); 
			  }
			  break;
		  case "礦泉水":
			  if(enterMoney>water) {
				  enterMoney = enterMoney-water;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("金額不足無法購買"); 
			  }
			  break;
		  case "可樂":
			  if(enterMoney>cola) {
				  enterMoney = enterMoney-cola;
				  System.out.println(enterMoney);
			  }
			  else {
				  System.out.println("金額不足無法購買"); 
			  }
			  break;
		}
	}

}

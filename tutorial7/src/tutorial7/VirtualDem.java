package tutorial7;

import java.math.BigDecimal;

public class VirtualDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("小明", "台北", 3, 3600.00);
	    Employee me = new Salary("安安", "台中", 2, 2400.00);
	    System.out.println("呼叫薪水郵件確認方法 --");   
	    s.mailCheck();
	    System.out.println("\n 呼叫員工郵件確認方法--");
	    me.mailCheck();
	    BigDecimal sal = me.getBonus(); //封裝特性
	    dataScientist a = new dataScientist("超人","新竹",1,"我是資料分析師");
	    me = a ; //我是資料科學家 ,我也可以是個員工,工作我全包 耶黑~
	}

}

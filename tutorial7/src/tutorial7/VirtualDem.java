package tutorial7;

import java.math.BigDecimal;

public class VirtualDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("�p��", "�x�_", 3, 3600.00);
	    Employee me = new Salary("�w�w", "�x��", 2, 2400.00);
	    System.out.println("�I�s�~���l��T�{��k --");   
	    s.mailCheck();
	    System.out.println("\n �I�s���u�l��T�{��k--");
	    me.mailCheck();
	    BigDecimal sal = me.getBonus(); //�ʸ˯S��
	    dataScientist a = new dataScientist("�W�H","�s��",1,"�ڬO��Ƥ��R�v");
	    me = a ; //�ڬO��Ƭ�Ǯa ,�ڤ]�i�H�O�ӭ��u,�u�@�ڥ��] �C��~
	}

}

package tutorial8;

import java.math.BigDecimal;

/**
 * 
 * �h��
 * Polymorphism (�i�R�P����o�O���k!!���妡���k)
 * @author User
 *
 */
public class Employee {
	   private String name;
	   private String address;
	   private int number;
	   private BigDecimal bonus = new BigDecimal(50000.00);
	   public Employee(String name, String address, int number) {
		  //�غc�lconstructor (��l�Ƨګإߪ������ݩ�)
	      System.out.println("�}�l�إ߭��u");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }
	   public static void main(String[] args) {
		   Employee boss = new Employee("001","�x�_��",100);
		   System.out.println(boss);
	   }
	   public void mailCheck() {
	      System.out.println("�l��T�{ " + this.name + " " + this.address);
	   }

	   public String toString() {
	      return name + " " + address + " " + number;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getAddress() {
	      return address;
	   }

	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }

	   public int getNumber() {
	      return number;
	   }
	   public BigDecimal getBonus() {
	        return bonus;
	  }
	}
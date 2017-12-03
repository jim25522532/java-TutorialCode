package tutorial8;

import java.math.BigDecimal;

/**
 * 
 * 多型
 * Polymorphism (波麗霏資母這是念法!!中文式念法)
 * @author User
 *
 */
public class Employee {
	   private String name;
	   private String address;
	   private int number;
	   private BigDecimal bonus = new BigDecimal(50000.00);
	   public Employee(String name, String address, int number) {
		  //建構子constructor (初始化我建立的物件屬性)
	      System.out.println("開始建立員工");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }
	   public static void main(String[] args) {
		   Employee boss = new Employee("001","台北市",100);
		   System.out.println(boss);
	   }
	   public void mailCheck() {
	      System.out.println("郵件確認 " + this.name + " " + this.address);
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
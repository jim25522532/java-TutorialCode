package tutorial7;

public class Salary extends Employee {
	   private double salary; // Annual salary
	   
	   public Salary(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   public void mailCheck() {
	      System.out.println("�~�����O���ݽT�{mail ");
	      System.out.println("�T�{mail " + getName()
	      + " �~�� " + salary);
	   }
	   
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	   
	   public double computePay() {
	      System.out.println("�p��Y�ӭ��u���~�� " + getName());
	      return salary/52;
	   }
	}
package tutorial7;

public class Salary extends Employee {
	   private double salary; // Annual salary
	   
	   public Salary(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   public void mailCheck() {
	      System.out.println("薪水類別不需確認mail ");
	      System.out.println("確認mail " + getName()
	      + " 薪水 " + salary);
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
	      System.out.println("計算某個員工的薪水 " + getName());
	      return salary/52;
	   }
	}
package javaCodeDemo1;

public class Employee {
	
	public void display(int empId,String empName) {
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+empName);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.display(1,"Amit");
		e1.display(2,"Pooja");
		e1.display(3,"Sumit");
		e1.display(4,"Priya");
		e1.display(5,"Neha");
		System.out.println("------------------------------");
		Employee e2 = new Employee();
		e1.display(12,"Kaira");
	}

}

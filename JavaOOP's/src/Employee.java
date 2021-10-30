public class Employee {
	public int salary(int amt) {
		System.out.println("Salary of Employee is "+amt);
		return amt;
	}
}
class manager extends Employee{
	public int salary(int amt) {
		System.out.println("Incentive of Manager is "+amt);
		return amt;
	}
}
class labour extends Employee{
	public int salary(int amt) {
		System.out.println("OverTime of Labour is "+amt);
		return amt;
	}
}
/*
	public static void main(String []args) {
		employee a = new employee();
		a.salary(1000);
		a=new manager();
		a.salary(10000);
		a=new labour();
		a.salary(700);
	}
}
*/

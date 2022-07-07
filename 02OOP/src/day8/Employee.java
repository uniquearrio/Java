package day8;

public class Employee {
	static int noOfEmployee =3;
	static int nextId = 1;
	final int empId;
	String name;
	int salary;
	
	static final float BONUS = 2.5f;//const variable
	
	public Employee() throws AppException {
		if(nextId > noOfEmployee)
			throw new AppException("Sorry");
		empId = nextId;
		nextId++;
	}
	public void initData(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void changeData(String new_name)
	

}
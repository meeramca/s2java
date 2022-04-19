
package employee;

public class Employee {
    int id;
	String name;
	
	public Employee(int i, String n)
	{
		id = i;
		name = n;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Govind");
        Employee emp2 = new Employee(2, "Akash");
	emp1.show();
	emp2.show(); 
    }
    
}

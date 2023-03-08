/**
 * 
 */
package Practise;

import java.util.Comparator;
import java.util.function.Function;

/**
 * @author Administrator
 *
 */
public class Employee implements Comparator{

	
	String id;
	String name;
    double salary;
	public int getsalary;
	public Employee(String id, String name, double saraly) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

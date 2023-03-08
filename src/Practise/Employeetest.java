/**
 * 
 */
package Practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Employeetest {

	private static Object comparator;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	List<Employee> e=new ArrayList<Employee>();
   e.add(new Employee("123","cjuah",20000));
  e.add(new Employee("273","sjha",25000));
  
  
   List<Employee>updateEmployee=e.stream()
   .filter(employee->employee.getsalary<=20000)
   .sorted(Comparator.comparing(Employee::getsalary).reversed())
	.peek(employee->{
		Double.salary=Employeetest.getsalary();
		if(salary>1000){
			emplloyee.setsalary(salary*1.05);
		}else if(salary>50000) {
			employee.setsalary(salary*1.1);
		}
	})
	.collect(Collectors.toList());
  System.out.println(updateEmployee);
	}

	private static int getsalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	


}

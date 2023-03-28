/**
 * 
 */
package BATCH3.SONARQUBE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
	public class Employeemain {

		public static void main(String[] args) {
		Employee e1=new Employee("vbhjkh",23,5,50000);
		Employee e2=new Employee("fhyfhk",21,6,60000);
		Employee e3=new Employee("gyju",25,7,70000);
		 List<Employee> employees = new ArrayList<Employee>();
		 employees.add(e1);
		 employees.add(e2);
		 employees.add(e3);
		 employees.stream().forEach(
				 val -> {
					 if(val.getYear()>=1 &&  val.getYear()<=2) {
						 double newsalary=val.getSalary() +(val.getYear()*2.5/100);
						 val.setSalary(newsalary);
					 }
					  if(val.getYear()>=3 &&  val.getYear()<=6) {
						 double newsalary=val.getSalary() +(val.getYear()*5.0/100);
						 val.setSalary(newsalary);
					 
				 }
					 else if(val.getYear()>=7 &&  val.getYear()<=10) {
						 double newsalary=val.getSalary() +(val.getYear()*10.0/100);
						 val.setSalary(newsalary);
					 }
					 else if(val.getYear()>=10) {
						 double newsalary=val.getSalary() +(val.getYear()*12/100);
						 val.setSalary(newsalary);

					 	}
				 }
				 );
		 employees.forEach(val->
		 System.out.println(val.getSalary()));
		}
	}


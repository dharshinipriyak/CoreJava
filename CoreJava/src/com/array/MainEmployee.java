package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee
{
	int EmpId;
	String EmpName;
	float EmpSal;
	String Department;
	public Employee(int empId, String empName, float empSal, String department) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSal = empSal;
		Department = department;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal + ", Department=" + Department
				+ "]";
	}
}
class MySortId implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {

		if(o1.EmpId>o2.EmpId)
			return 1;
		else if (o1.EmpId<o2.EmpId)
			return -1;
		else 
			return 0;
	}
}
class MySortName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return(o1.EmpName.compareTo(o2.EmpName));
				
	}
	
}
class MySortSalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.EmpSal>o2.EmpSal)
			return 1;
		else if (o1.EmpSal<o2.EmpSal)
			return -1;
		else 		
		return 0;
	}
	
}
public class MainEmployee {

	public static void main(String[] args) {
		Employee Emp1=new Employee(7773,"Varun Takur  ",49600f,"Manufacturing");
		Employee Emp2=new Employee(8217,"Ravindra K S ",23950f,"Marketing");
		Employee Emp3=new Employee(4323,"Deepak Kumar ", 25500f, "Packing");
		Employee Emp4=new Employee(8369,"Surendar S   ",56599f, "Accounts");
		ArrayList<Employee> getDetails=new ArrayList<Employee>();
		getDetails.add(Emp1);
		getDetails.add(Emp2);
		getDetails.add(Emp3);
		getDetails.add(Emp4);
		System.out.println(getDetails);
		System.out.println("Before Sorting");

		Iterator<Employee> Itremp=getDetails.iterator();
		while(Itremp.hasNext())	
		{
			Employee obj=Itremp.next();
			System.out.println(obj.EmpId+"    "+ obj.EmpName+"    "+obj.EmpSal+"    "+obj.Department);
		}
		
		//Sorting based on Id
		
		Collections.sort(getDetails, new MySortId());
		System.out.println("After Sorting based on Id");
	
			Iterator<Employee> Itremp1=getDetails.iterator();
			while(Itremp1.hasNext())	
			{
				Employee obj1=Itremp1.next();
				System.out.println(obj1.EmpId+"    "+ obj1.EmpName+"    "+obj1.EmpSal+"    "+obj1.Department);
			}
		
			//sorting based on Names
		Collections.sort(getDetails, new MySortName());
		System.out.println("After sorting based on names");
		
			Iterator<Employee> itremp2=getDetails.iterator();
			while(itremp2.hasNext())
			{
				Employee obj2=itremp2.next();
				System.out.println(obj2.EmpId+"    "+ obj2.EmpName+"    "+obj2.EmpSal+"    "+obj2.Department);
			}
		
			//sorting based on Salary
		Collections.sort(getDetails, new MySortSalary());
			System.out.println("After sorting based on salary");
			
				Iterator<Employee> itremp3=getDetails.iterator();
				while(itremp3.hasNext())
				{
					Employee obj3=itremp3.next();
					System.out.println(obj3.EmpId+"    "+ obj3.EmpName+"    "+obj3.EmpSal+"    "+obj3.Department);
				}
		
	}
}


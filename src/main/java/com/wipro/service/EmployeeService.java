package com.wipro.service;

import java.util.ArrayList;
import java.util.List;

import com.wipro.entity.Employee;

public class EmployeeService {
	
	List<Employee> employees;
	
	EmployeeService(){
		
	}
	
	
	public EmployeeService(List<Employee> employees) {

		this.employees = employees;
	}


	public Employee getEmployeeById(int id){
		Employee emp=null;
		
		if(id>0){
			for(Employee e:employees){
				if(id==e.getId()){
					emp=e;
				}
			}
		}
		return emp;
	}
	
	public List<Employee> getEmployeesByCellNumbers(int num){

		
		List<Employee> foundEmployees=new ArrayList<Employee>();	
		
		if(num==0){
			
			for(Employee e:employees){
				if(e!=null){
					if(e.getCellNumbers()==null||e.getCellNumbers().size()==0){
						foundEmployees.add(e);
						
					}
				}
			}
			
		}else if(num>0){
			for(Employee e:employees){
				if(e.getCellNumbers()!=null){
					if(num==e.getCellNumbers().size()){
						foundEmployees.add(e);
					}					
				}			
			}			
	
		}

		return foundEmployees;
	}

	//input num is verified for number cell numbers emp has
	// as many employees has num then all employee to be returned
	//otherwise return null

	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	

}

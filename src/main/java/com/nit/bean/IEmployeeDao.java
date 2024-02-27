package com.nit.bean;

import java.util.List;

import com.nit.entity.Employee;

public interface IEmployeeDao {
	public List<Employee> getResultData(String degn1,String degn2,String degn3)throws Exception;
				
	}



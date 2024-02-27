package com.nit.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.entity.Employee;
@Repository("daoEmp")
public class EmployeeDAOImp implements IEmployeeDao {
	private static final String GET_EMP_DETA="SELECT * FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getResultData(String degn1, String degn2, String degn3) throws Exception {
		List<Employee> l=null;
		try(Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(GET_EMP_DETA);){	
			ps.setString(1, degn1);
			ps.setString(2, degn2);
			ps.setString(3, degn3);
			try(ResultSet rs=ps.executeQuery()){
				l=new ArrayList();
				
				while(rs.next()) {
					Employee e=new Employee();
					e.
					
				}
			}
		}
		
		return null;
	}

}

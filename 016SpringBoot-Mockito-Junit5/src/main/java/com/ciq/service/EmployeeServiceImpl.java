package com.ciq.service;

import com.ciq.dao.AddressDao;
import com.ciq.dao.DeparementDao;
import com.ciq.dao.EmployeeDao;
import com.ciq.entity.Address;
import com.ciq.entity.Deparement;
import com.ciq.entity.Employee;
import com.ciq.entity.EmployeeResponse;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	private AddressDao addressDao;
	
	private DeparementDao deparementDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao, AddressDao addressDao, DeparementDao deparementDao) {
		super();
		this.employeeDao = employeeDao;
		this.addressDao = addressDao;
		this.deparementDao = deparementDao;
	}
	@Override
	public EmployeeResponse getempolyeebyid(Integer eid) {
		Employee employee=employeeDao.getemployeebyid(eid);
		Address address =addressDao.getaddressbyid(eid);
		Deparement deparement=deparementDao.grtdeparementbyid(eid);
		EmployeeResponse employeeResponse=new EmployeeResponse();
		employeeResponse.setDeparement(deparement);
		employeeResponse.setAddress(address);
		employeeResponse.setEmployee(employee);
		return employeeResponse;
	}

}

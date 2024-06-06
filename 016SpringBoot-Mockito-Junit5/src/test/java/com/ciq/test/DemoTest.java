package com.ciq.test;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ciq.dao.AddressDao;
import com.ciq.dao.DeparementDao;
import com.ciq.dao.EmployeeDao;
import com.ciq.entity.Address;
import com.ciq.entity.Deparement;
import com.ciq.entity.Employee;
import com.ciq.entity.EmployeeResponse;
import com.ciq.service.EmployeeServiceImpl;

public class DemoTest {
		@Mock
		private AddressDao addressDAO;

		@Mock
		private DeparementDao departmentDAO;

		@Mock
		private EmployeeDao employeeDAO;

		@InjectMocks
		private EmployeeServiceImpl employeeServiceImpl;

		@BeforeEach
		void setUp() {
			MockitoAnnotations.openMocks(this);
		}

		@Test
		public void findByIdEmployeeTest() {
			when(employeeDAO.getemployeebyid(1001)).thenReturn(getEmpSetUp());
			when(addressDAO.getaddressbyid(1001)).thenReturn(getAddressSetUp());
			when(departmentDAO.grtdeparementbyid(1001)).thenReturn(getDepartmentSetUp());

			
		     EmployeeResponse employeeResponse = 	employeeServiceImpl.getempolyeebyid(1001);
		     
		     System.out.println(employeeResponse);

		}

		Employee getEmpSetUp() {
			Employee employee = new Employee();
			employee.setEid(1001);
			employee.setEname("Bhargav");
			return employee;
		}

		Address getAddressSetUp() {
			Address address = new Address();
			address.setAid(1);
			address.setAloc("SKLM");
			address.setPincode("532408");
			return address;
		}

		Deparement getDepartmentSetUp() {
			Deparement department = new Deparement();
			department.setDid(1);
			department.setDname("IT");
			return department;
		}

	}

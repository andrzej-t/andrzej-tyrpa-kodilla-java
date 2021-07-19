package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class SearchingFacadeTestSuite {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    SearchingFacade searchingFacade;

    @Test
    public void searchEmployeeTest() {
        //Given
        Employee employee1 = new Employee("John", "Nowak");
        Employee employee2 = new Employee("Mark", "Nowacky");

        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        List<Employee> employees = searchingFacade.findEmployee("Nowa");

        //Then
        assertFalse(employees.isEmpty());

        //CleanUp
        try {
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void searchCompanyTest() {
        //Given
        Company company1 = new Company("Make a wish");
        Company company2 = new Company("Make money");

        //When
        companyDao.save(company1);
        companyDao.save(company2);
        List<Company> companies = searchingFacade.findCompany("Make");

        //Then
        assertFalse(companies.isEmpty());

        //CleanUp
        try {
            companyDao.delete(company1);
            companyDao.delete(company2);
        } catch (Exception e) {
            //do nothing
        }
    }
}

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
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
}

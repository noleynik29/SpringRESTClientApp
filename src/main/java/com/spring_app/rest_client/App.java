package com.spring_app.rest_client;

import com.spring_app.rest_client.config.MyConfig;
import com.spring_app.rest_client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        //Get all employees
        //List<Employee> allEmployees = communication.getAllEmployees();
        //System.out.println(allEmployees);

        //Get employee by id
        //Employee empById = communication.getEmployee(1);
        //System.out.println(empById);

        //Add new employee
        //Employee emp = new Employee("Andrey" , "Sytnik", "IT", 300);
        //communication.saveEmployee(emp);

        //Update employee
        //Employee emp = new Employee("Andrey" , "Sytnik", "IT", 400);
        //emp.setId(id);
        //communication.saveEmployee(emp);

        //Delete employee
        //communication.deleteEmployee(id);
    }
}

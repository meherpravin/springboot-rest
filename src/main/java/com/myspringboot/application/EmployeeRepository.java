package com.myspringboot.application;

import com.myspringboot.application.domain.Employee;
import com.myspringboot.application.exception.EmployeeNotFoundException;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeRepository {
    private Map<Long, Employee> employees = new HashMap();

    public Employee save(Employee e){
        employees.put(e.getId(), e);
        return e;
    }


    public List<Employee> findAll(){
        return new ArrayList<>(this.employees.values());
    };

    public Employee findById(Long id) throws EmployeeNotFoundException {
        return employees.get(id);
    };
}

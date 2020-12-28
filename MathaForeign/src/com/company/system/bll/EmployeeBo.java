/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.bll;

import com.company.system.model.Employee;
import java.util.List;

/**
 *
 * @author KASUN
 */
public interface EmployeeBo {
    public void save(Employee obj);
    public void update(Employee obj);
    public void delete(Employee obj);
    public List<Employee> list();
    public Employee get(int id);
}

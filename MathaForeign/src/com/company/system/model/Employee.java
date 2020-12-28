/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.model;

import java.util.Collection;

/**
 *
 * @author KASUN
 */
public class Employee extends Person{
    private Collection<EmployeePhone> employeePhone;
    private Collection<Customer> customer;

    public Collection<EmployeePhone> getEmployeePhone() {
        return employeePhone;
    }
    public void setEmployeePhone(Collection<EmployeePhone> employeePhone) {
        this.employeePhone = employeePhone;
    }
    public Collection<Customer> getCustomer() {
        return customer;
    }
    public void setCustomer(Collection<Customer> customer) {
        this.customer = customer;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
}

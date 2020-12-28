/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.dal;

import com.company.system.model.Customer;
import java.util.List;

/**
 *
 * @author KASUN
 */
public interface CustomerDao {
    public void save(Customer obj);
    public void update(Customer obj);
    public void delete(Customer obj);
    public List<Customer> list();
    public Customer get(int id);
}

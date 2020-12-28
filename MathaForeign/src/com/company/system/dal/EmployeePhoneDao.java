/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.dal;

import com.company.system.model.EmployeePhone;
import java.util.List;

/**
 *
 * @author KASUN
 */
public interface EmployeePhoneDao {
    public void save(EmployeePhone obj);
    public void update(EmployeePhone obj);
    public void delete(EmployeePhone obj);
    public List<EmployeePhone> list();
    public EmployeePhone get(int id);
}

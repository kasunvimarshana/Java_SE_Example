/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.bll;

import com.company.system.dal.*;
import com.company.system.model.CustomerPhone;
import java.util.List;

/**
 *
 * @author KASUN
 */
public interface CustomerPhoneBo {
    public void save(CustomerPhone obj);
    public void update(CustomerPhone obj);
    public void delete(CustomerPhone obj);
    public List<CustomerPhone> list();
    public CustomerPhone get(int id);
}

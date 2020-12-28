/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.bll;

import com.company.system.model.Country;
import java.util.List;

/**
 *
 * @author KASUN
 */
public interface CountryBo {
    public void save(Country obj);
    public void update(Country obj);
    public void delete(Country obj);
    public List<Country> list();
    public Country get(int id);
}

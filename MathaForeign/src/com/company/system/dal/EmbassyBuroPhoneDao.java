/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.dal;

import com.company.system.model.AgentPhone;
import java.util.List;

/**
 *
 * @author KASUN
 */
public interface EmbassyBuroPhoneDao {
    public void save(AgentPhone obj);
    public void update(AgentPhone obj);
    public void delete(AgentPhone obj);
    public List<AgentPhone> list();
    public AgentPhone get(int id);
}

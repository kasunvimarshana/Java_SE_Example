/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.dal;

import com.company.system.model.Agent;
import java.util.List;

/**
 *
 * @author KASUN
 */
public interface EmbassyBuroDao {
    public void save(Agent obj);
    public void update(Agent obj);
    public void delete(Agent obj);
    public List<Agent> list();
    public Agent get(int id);
}

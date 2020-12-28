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
public class Agent extends Person{
    private Collection<AgentPhone> agentPhone;
    private Collection<Customer> customer;

    public Collection<AgentPhone> getAgentPhone() {
        return agentPhone;
    }
    public void setAgentPhone(Collection<AgentPhone> agentPhone) {
        this.agentPhone = agentPhone;
    }
    public Collection<Customer> getCustomer() {
        return customer;
    }
    public void setCustomer(Collection<Customer> customer) {
        this.customer = customer;
    }
 
}

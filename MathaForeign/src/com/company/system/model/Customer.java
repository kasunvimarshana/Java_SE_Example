/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.model;

import java.util.Collection;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author KASUN
 */
public class Customer extends Person{
    private String registerNumber;
    private Collection<CustomerPhone> customerPhone;
    private boolean passport;
    private boolean fbr;
    private boolean traning;
    private boolean medical;
    private boolean visaApply;
    private boolean visa;
    private boolean embassyBuro;
    private Date departure;
    private Employee employee;
    private Agent agent;
    private boolean register;

    public String getRegisterNumber() {
        return registerNumber;
    }
    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
    public Collection<CustomerPhone> getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(Collection<CustomerPhone> customerPhone) {
        this.customerPhone = customerPhone;
    }
    public boolean isPassport() {
        return passport;
    }
    public void setPassport(boolean passport) {
        this.passport = passport;
    }
    public boolean isFbr() {
        return fbr;
    }
    public void setFbr(boolean fbr) {
        this.fbr = fbr;
    }
    public boolean isTraning() {
        return traning;
    }
    public void setTraning(boolean traning) {
        this.traning = traning;
    }
    public boolean isMedical() {
        return medical;
    }
    public void setMedical(boolean medical) {
        this.medical = medical;
    }
    public boolean isVisaApply() {
        return visaApply;
    }
    public void setVisaApply(boolean visaApply) {
        this.visaApply = visaApply;
    }
    public boolean isVisa() {
        return visa;
    }
    public void setVisa(boolean visa) {
        this.visa = visa;
    }
    public Date getDeparture() {
        return departure;
    }
    public void setDeparture(Date departure) {
        this.departure = departure;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Agent getAgent() {
        return agent;
    }
    public void setAgent(Agent agent) {
        this.agent = agent;
    }
    public boolean isRegister() {
        return register;
    }
    public void setRegister(boolean register) {
        this.register = register;
    }
    public boolean isEmbassyBuro() {
        return embassyBuro;
    }
    public void setEmbassyBuro(boolean embassyBuro) {
        this.embassyBuro = embassyBuro;
    }
    
}

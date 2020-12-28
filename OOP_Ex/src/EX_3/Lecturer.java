/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_3;

/**
 *
 * @author KASUN
 */
public class Lecturer extends Person implements Fightable{
    
    private String epf;
    private double hourlyRate;
    
    
    public void fight(){
        System.out.println("Lecturer is Fighting ... ");
    }

    /**
     * @return the epf
     */
    public String getEpf() {
        return epf;
    }

    /**
     * @param epf the epf to set
     */
    public void setEpf(String epf) {
        this.epf = epf;
    }

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    
    
}

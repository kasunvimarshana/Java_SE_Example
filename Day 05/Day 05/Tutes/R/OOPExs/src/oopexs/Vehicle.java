/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oopexs;

/**
 *
 * @author Nadun
 */
abstract  public class Vehicle {


    private String chassisNo;
    public String engineNo;

    public Vehicle(){
        System.out.println("In Vehicle...");
    }
    /**
     * @return the chassisNo
     */
    public String getChassisNo() {
        return chassisNo;
    }

    /**
     * @param chassisNo the chassisNo to set
     */
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    /**
     * @return the engineNo
     */
    abstract public String getEngineNo();

    /**
     * @param engineNo the engineNo to set
     */
    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }
    

}

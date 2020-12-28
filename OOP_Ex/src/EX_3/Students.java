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
public class Students extends Person implements Fightable{
    
    private double courseFee;

    /**
     * @return the courseFee
     */
    public double getCourseFee() {
        return courseFee;
    }
    
    public void fight(){
        System.out.println("Student is Fighting ... (Athin, Payin, Pollen)");
    }

    /**
     * @param courseFee the courseFee to set
     */
    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
 
    public void setCourseFee(double courseFee, double discount){ //methos overloading
        this.courseFee = courseFee - discount; 
    }
    
    @Override
    public String getTp(){ //methos overriding
        return "<Not Display>";
    }
    
}

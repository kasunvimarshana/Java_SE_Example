/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_3;

import EX_3.Students;

/**
 *
 * @author KASUN
 */
public class Demo {
    
    public static void main(String[] args) {
        
        Students s1 = new Students();
        
        s1.setName("kasun");
        s1.setEmail("kasunvmail@gmail.com");
        s1.setAddress("debahara");
        s1.setTp("0713525253");
        s1.setCourseFee(45000);
        s1.setCourseFee(45000, 5000); //use of overloaded method
        
        System.out.println("course fee = " + s1.getCourseFee());
        System.out.println("Phone = " + s1.getTp());
        
        s1.fight();
        
        Lecturer l1 = new Lecturer();
        l1.fight();
        
    }
    
}

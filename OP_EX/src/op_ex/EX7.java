/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op_ex;

/**
 *
 * @author KASUN
 */
public class EX7 {
    
    public static void main(String args[]){
    
        int x = 6;
        boolean b1 = ( x > 5 );
        boolean b2 = ( x > 10 );
        
        System.out.println(" b1 & b2 = " + (b1 & b2));
        System.out.println(" b1 | b2 = " + (b1 | b2));
        System.out.println(" !b1 = " + (!b1));
        System.out.println(" b1 && b2 = " + (b1 && b2));
        System.out.println(" b1 || b2 = " + (b1 || b2));
        
    }
    
}

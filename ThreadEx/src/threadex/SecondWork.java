/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadex;

/**
 *
 * @author KASUN
 */
public class SecondWork extends Thread{
    
    @Override
    public void run(){
        ThreadEx.printLetters();
    }
    
}

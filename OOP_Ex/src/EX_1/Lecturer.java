/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_1;

import java.util.List;

/**
 *
 * @author KASUN
 */
public class Lecturer {
    
    String name;
    String address;
    String email;
    String tp;
    List<String> subjects;
    
    public void changeTp(String tp){
        this.tp = tp;
    }
    
}

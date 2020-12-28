/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileex;

/**
 *
 * @author KASUN
 */

import java.io.File;
import java.io.FileReader;

public class Ex5 {
    
    public static void main(String[] args) {
        
        try{
        
            File file = new File("F:/JAVA_SE/FileEX/ABC4.txt");
            
            FileReader fileReader = new FileReader(file);
            
            char[] buffer = new char[2000];
            fileReader.read(buffer);
            String text = new String(buffer);
            System.out.println("Text = " + text);
            
        }catch(Exception e){
            System.out.println("Error = " + e.getMessage());
        }
        
    }
    
}

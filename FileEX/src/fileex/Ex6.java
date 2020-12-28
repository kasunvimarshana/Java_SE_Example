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
import java.io.BufferedReader;

public class Ex6 {
    
    public static void main(String[] args) {
        
        try {
            File file = new File("F:/JAVA_SE/FileEX/ABC4.txt");
            FileReader fileReader = new FileReader(file);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String text = "";
            
            while(bufferedReader.ready()){//while there is a new line
                text += bufferedReader.readLine() + " ";
            }
            
            System.out.println("Text = " + text);
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
        
    }
    
}

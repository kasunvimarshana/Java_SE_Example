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
import java.io.FileWriter;

public class Ex2 {
    
    public static void main(String[] args) {
        
        try{
        
            File file = new File("F:/JAVA_SE/FileEX/ABC2.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Kamal\nNimal\n");
            fileWriter.write("Kamal\nNimal\n");
            fileWriter.flush();
            fileWriter.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}

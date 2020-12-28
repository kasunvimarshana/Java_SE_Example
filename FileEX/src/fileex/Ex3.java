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
import java.io.BufferedWriter;

public class Ex3 {
    
    public static void main(String[] args) {
        
        //using buffered writer we can use new lines
        try{
        
            File file = new File("F:/JAVA_SE/FileEX/ABC3.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write("Kamal");
            bufferedWriter.newLine();
            bufferedWriter.write("Nimal");
            bufferedWriter.newLine();
            bufferedWriter.write("Saman");
            bufferedWriter.newLine();
            
            bufferedWriter.flush();//flush before closing
            bufferedWriter.close();//close file when done
            
        }catch(Exception e){
            System.out.println("Message = " + e.getMessage());
        }
        
    }
    
}

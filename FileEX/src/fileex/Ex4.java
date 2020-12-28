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

import java.io.PrintWriter;

public class Ex4 {
    
    public static void main(String[] args) {
        
        try{
            PrintWriter printWriter = new PrintWriter("F:/JAVA_SE/FileEX/ABC4.txt");
            
            printWriter.println("Kamal");
            printWriter.println("Nimal");
            printWriter.println("Saman");
            printWriter.println("Ajith");
            
            printWriter.flush();
            printWriter.close();
        }catch(Exception e){
            System.out.println("Error = " + e.getMessage());
        }
        
    }
    
}

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

public class Ex1 {
    
    /*public static void main(String[] args) throws Exception{//psvm -> tab
        File f1 = new File("F:/JAVA_SE/FileEX/ABC.txt");//create a file in the ram
        f1.createNewFile();
    }*/
    
    public static void main(String[] args){//psvm -> tab
        File f1 = new File("F:/JAVA_SE/FileEX/ABC1.txt");//create a file in the ram
        try{
            f1.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error = " + e.getMessage());
        }
    }
    
}

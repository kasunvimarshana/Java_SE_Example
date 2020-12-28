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
public class ThreadEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*SecondWork sw = new SecondWork();
        sw.start();*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                printLetters();
            }
        };
        new Thread(runnable).start();
        printNumbers();
        //printLetters();
        
    }
    
    public static void printNumbers(){
        for(int i = 0; i < 10000; i++){
            System.out.println(i);
        }
    }
    
    public static void printLetters(){
        for(int i = 0; i < 10000; i++){
            char c = (char) i;
            System.out.println(c);
        }
    }
    
}

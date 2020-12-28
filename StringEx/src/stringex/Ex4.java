/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringex;

import java.util.Scanner;

/**
 *
 * @author KASUN
 */
public class Ex4 {
    
    public static void main(String[] args) {
        String s1 = "string";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s2 = sc.nextLine();
        boolean b1 = s1.equalsIgnoreCase(s2);
        if(b1){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        
        System.out.println("Enter String");
        String s3 = sc.nextLine();
        boolean b2 = s3.equals(s3);
        if(b2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
    
}

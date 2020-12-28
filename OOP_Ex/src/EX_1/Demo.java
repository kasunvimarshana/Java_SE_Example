/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_1;

import EX_2.Item;

/**
 *
 * @author KASUN
 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Kasun";
        s1.address = "Debahara";
        s1.email = "kasunvmail@gmail.com";
        s1.tp = "0713525253";
        System.out.println("==========Student==========");
        System.out.println("Name = " + s1.name);
        System.out.println("Address = " + s1.address);
        
        s1.count = 1;
        Student.count = 2;
        
        System.out.println("Count = " + s1.count);
        
        Lecturer l1 = new Lecturer();
        l1.name = "lecturer name";
        l1.address = "address";
        l1.email = "email";
        l1.tp = "0000000000";
        System.out.println("==========Lecturer==========");
        System.out.println("Name = " + l1.name);
        System.out.println("Address = " + l1.address);
        System.out.println("E-mail = " + l1.email);
        System.out.println("Phone = " + l1.tp);
        l1.changeTp("9999999999");
        System.out.println("Phone = " + l1.tp);
        
        Item item = new Item();
        
        item.setItemCode(1);
        item.setName("Usha Celling Fan");
        item.setBrand("USHA");
        item.setModel("SD30");
        item.setBuyingPrice(2300);
        item.setSellingPrice(2300);
        
        System.out.println("Name = " + item.getName());
        System.out.println("BP = " + item.getBuyingPrice());
        System.out.println("SP = " + item.getSellingPrice());
        
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        
        Item item4 = new Item(1, "Usha Celling Fan", 3500);
        
    }
}

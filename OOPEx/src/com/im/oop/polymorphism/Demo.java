/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KASUN
 */
public class Demo {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Dog());
        list.add(new Cat());
        list.add(new Cow());
        
        for(Animal animal : list){
            animal.sound();
        }
        
    }
}

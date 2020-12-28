/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oopexs;

/**
 *
 * @author Nadun
 */
public class Bike extends  Vehicle{
    static String newestBike;
    private String regNo;
    private int gear;
    private Person owner;

    public Bike(){
        System.out.println("In Bike()");
    }

    public Bike(String rNo){// constructor overloading
        this();
        System.out.println("In Bike(String regNo)");
        regNo = rNo;
    }
    public Bike(String regNo,int gear, Person owner){// constructor overloading

        this.regNo = regNo;
        this.gear = gear;
        this.owner = owner;
    }

    public static String getNewestBike(){
        return newestBike;
    }



    public void setRegNo(String newRegNo){
        regNo = newRegNo;
        newestBike = regNo;
    }

    public void setGear(int newGear){
        if(newGear >= 0 && newGear<6){ //Data Validation
            gear = newGear;
        }
    }

    public void setPerson(Person newOwner){
        owner = newOwner;
    }

    public String getRegNo(){
        return regNo;
    }

    public int getGear(){
        return gear;
    }

    public Person getOwner(){
        return owner;
    }

    public int increamentGear(int gearCount){ //Method Overloading
        if(gearCount<6){//Pre condition
            gear+=gearCount;
            if(gear>0 && gear <=5){//Post Condition
                return gear;
            }else{
                return gear-=gearCount;
            }
        }else{
            return gear;
        }
    }

    public int increamentGear(int gearCount,boolean clutch){//Method Overloading
        if(clutch && gearCount<6){//Pre condition
            gear+=gearCount;
            if(gear>0 && gear <=5){//Post Condition
                return gear;
            }else{
                return gear-=gearCount;
            }
        }else{
            return gear;
        }
    }

    @Override
    public String getEngineNo(){//Method Override
        return engineNo;
    }


}

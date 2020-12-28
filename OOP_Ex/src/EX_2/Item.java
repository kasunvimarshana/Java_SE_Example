/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_2;

/**
 *
 * @author KASUN
 */
public class Item {
    
    private int itemCode;
    private String name;
    private String brand;
    private String model;
    private double buyingPrice;
    private double sellingPrice;
    static int count;
    
    public Item(){//this section called constructor
        this.count++;
        System.out.println("Item() created = " + this.count); 
    }
    
    public Item(int itemCode, String name, double sellingPrice){
        this.count++;
        this.itemCode = itemCode;
        this.name = name;
        this.sellingPrice = sellingPrice;
        System.out.println("Item (int, String, double) created = " + this.count);
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        if(buyingPrice >= 0){ //Data Validation
            this.buyingPrice = buyingPrice;
        }
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    
    
    
}

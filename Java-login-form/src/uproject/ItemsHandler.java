/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uproject;
import java.util.HashMap;
import java.util.Scanner;



/**
 *
 * @author Caio
 */
public class ItemsHandler {
    
    int item_amount = 0;  
    float item_price = 0;
    int item_sales = 0;
    String item_name = "";
    
    public ItemsHandler(int item_a, float item_p, int item_s, String item_n){
        this.item_amount = item_a;
        this.item_price = item_p;
        this.item_sales = item_s;
        this.item_name = item_n;
    }
    
    
    public void setName(String name){
        this.item_name = name;
    }
    
    public void setAmount(int amount){
        this.item_amount = amount;
    }
    
    public void setPrice(float price){
        this.item_price = price;
    }
    
    public void setSales(int newsales){
        this.item_sales = newsales;
    }
    
    public int getSales(){
        return this.item_sales;
    }
    
    public float getPrice(){
        return this.item_price;
    }
    
    public int getAmount(){
        return this.item_amount;
    }
    
    public String getName(){
        return this.item_name;
    }
    
    public String promptNewItem(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Insert a item name");
       String itemName = scan.nextLine();
       return itemName;
   }
      
    
}

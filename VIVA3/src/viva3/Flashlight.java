/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIVA3;

/**
 *
 * @author SILVIA EVAFARINA
 */
public class Flashlight extends Equipment {
    
    private String name;
    private int battery;
    
    public Flashlight(){
        this.name= "Flashlight";
        this.battery = 100;
    }
    
    public String getName(){
        return this.name;
    }
    public int getBattery(){
        return this.battery;
    }
        
    
    
}

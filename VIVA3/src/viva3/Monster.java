/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Shaurah Sasha
 */
public class Monster {
    
    private String name;
    private String uniqueAbility;
    private int batteryReduction;
    
    public Monster() {
        this.name = "";
        this.uniqueAbility = "";
        this.batteryReduction = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getUniqueAbility() {
        return uniqueAbility;
    }
    
    public void useUniqueAbility() {
        System.out.println(getName() + getUniqueAbility());
    }
    
    public int getBatteryReduction() {
        return this.batteryReduction;
    }
    
}

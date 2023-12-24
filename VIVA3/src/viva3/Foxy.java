/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Shaurah Sasha
 */
public class Foxy extends Monster{
    
    private String name;
    private String uniqueAbility;
    private int batteryReduction;
    
    public Foxy() {
        this.name = "Foxy";
        this.uniqueAbility = " can only be blocked by close door.";
        this.batteryReduction = 0;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getUniqueAbility() {
        return uniqueAbility;
    }
    
    @Override
    public void useUniqueAbility() {
        System.out.println(getName() + getUniqueAbility());
    }
    
    @Override
    public int getBatteryReduction() {
        return this.batteryReduction;
    }
    
    public String toString() {
        return getName();
    } 
}

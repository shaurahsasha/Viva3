/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIVA3;

/**
 *
 * @author SILVIA EVAFARINA
 */
public class CloseDoor extends Equipment{

    private String name;
    private int doorUses;

    public CloseDoor(){
        this.name= "CloseDoor";
        this.doorUses = 50;
    }
    
    public String getName(){
        return this.name;
    }
    public int getDoorUses(){
        return this.doorUses;
    }

}

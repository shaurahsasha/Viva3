/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIVA3;

/**
 *
 * @author SILVIA EVAFARINA
 */
public class Equipment {
    
    //instances
    private Flashlight flashlight;
    private CloseDoor closeDoor;
    
    public Equipment[] createEquipment(Flashlight f, CloseDoor c){
        this.flashlight = f;
        this.closeDoor = c;
        Equipment[] equipmentArray = null;
        
        return equipmentArray;
        
    }   
    
    public void equipmentList(){
        System.out.println("Equipment List: ");
        System.out.println("Flashlight Battery: " +flashlight);
        
    }
   
}

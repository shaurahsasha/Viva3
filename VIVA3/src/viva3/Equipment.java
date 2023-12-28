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

    public Equipment(Flashlight flashlight, CloseDoor closeDoor){
        this.flashlight=flashlight;
        this.closeDoor=closeDoor;
    }    

    public void equipmentList(){
        System.out.println("Equipment List:");
        System.out.println("Flashlight Battery: " +flashlight.getBattery());
        System.out.println("CloseDoor: " +closeDoor.getDoorUses());
    }    

    public boolean useEquipment(String equipmentName, Monster monster){
        if(equipmentName.equals("Flashlight")){
            int batteryReduction = monster.getBatteryReduction();
            int currentBattery = flashlight.getBattery();
            if(currentBattery >= batteryReduction){
                flashlight.reduceBattery(batteryReduction);
                return true;
            }else{
                System.out.println("Not enough battery for flashlight!");
                return false;
        else if(equipmentName.equals("CloseDoor"){
            int doorUses = closeDoor.getDoorUses();
            if(doorUses > 0){
                closeDoor.reduceDoorUses();
                return true;
            }else{
                "System.out.println("No more door uses left!");
                return false;
            }
        }else{
            System.out.println("Invalid equipment name!");
            return false;
        }
    }    
   
}

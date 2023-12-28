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
    private Equipment[] equipmentItems;
    
    public Equipment[] createEquipment(Flashlight f, CloseDoor c){
        equipmentItems = new Equipment[]{f,c};
        return equipmentItems;
    }
    
    public void equipmentList(){
        if (equipmentItems != null && equipmentItems.length>0){
            for(Equipment item : equipmentItems){
                if (item instanceof Flashlight){
                    Flashlight flashlight = (Flashlight) item;
                    System.out.println(flashlight.getName()+ ":Remaining battery life - " + flashlight.getBattery()); 
                }else if (item instanceof CloseDoor){
                    CloseDoor closeDoor = (CloseDoor) item;
                    System.out.println(closeDoor.getName()+ ":Uses -" +closeDoor.getUses());
                }
            }
        }else{
            System.out.println("No equipment available.");
        }
    }

   
}

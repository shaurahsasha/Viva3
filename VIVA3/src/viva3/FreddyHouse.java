/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Shaurah Sasha
 */
public class FreddyHouse {
    
    private final int arrSize;
    private Monster[] arrMonster;
    
    public FreddyHouse(int arrSize) {
        this.arrSize = arrSize;
    } 
    
    public int getArrSize() {
        return arrSize;
    }
    
    public Monster[] createMonsters() {
        Random random = new Random();
        arrMonster = new Monster[getArrSize()];
        
        for(int i = 0; i < getArrSize(); i ++) {
            int randomNumber = random.nextInt(4 - 1) + 1;
            
            switch (randomNumber) {
                case 1:
                    arrMonster[i] = new Fazbear();
                    break;
                case 2:
                    arrMonster[i] = new Bonnie();
                    break;
                case 3:
                    arrMonster[i] = new Chica();
                    break;
                case 4:
                    arrMonster[i] = new Foxy();
                    break;
                default:
                    arrMonster[i] = new Monster();
            }
        }
        return arrMonster;
    }
    
    public void printMonsterAndAbilities () {
        Fazbear fazbear = new Fazbear();
        fazbear.useUniqueAbility();
        
        Bonnie bonnie = new Bonnie();
        bonnie.useUniqueAbility();
        
        Chica chica = new Chica();
        chica.useUniqueAbility();
        
        Foxy foxy = new Foxy();
        foxy.useUniqueAbility();
    }
    
    public String toString() {
        return Arrays.toString(arrMonster);
    }
    
}

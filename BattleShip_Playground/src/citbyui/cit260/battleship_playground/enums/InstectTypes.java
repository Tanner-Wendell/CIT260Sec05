/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.battleship_playground.enums;

/**
 *
 * @author tannerwe
 */
public enum InstectTypes {
    GRASSHOPPER ("I am a Grasshopper."),
    LADYBUG ("I am a Lady Bug."),
    BEETLE ("I am a Beetle.");
    
    String insectName;
  
    private InstectTypes (String insectName) {
        this.insectName = insectName;
    }
    
    public String getInsectName(){
        return insectName; 
    } 
}

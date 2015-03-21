/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.battleship_playground.lesson09;

/**
 *
 * @author tannerwe
 */
public abstract class Insect {
    public int nEyes = 0;
    public String iName = null;
    
    public void numEyes(int nEyes){
            this.nEyes = nEyes;
    }
    // Getter method
    public abstract int getEyes();

    public Insect() {
    }
    public Insect(int nEyes) {
        numEyes(nEyes);
    }

}
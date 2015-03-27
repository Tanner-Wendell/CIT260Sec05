/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.battleship_playground.lesson11;

/**
 *
 * @author tannerwe
 */
public class Lesson11Exception extends Exception{
    int n;
    int d;
    
    Lesson11Exception (int i, int j){
        n = i;
        d = j;
    }
    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer.";
    }
}

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
public class Lesson11 {
    int numer[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
    int denom[] = { 2, 0, 4, 4, 0, 8 };
    
    public void displayExcepExamp(){
        for (int i=0; i<numer.length; i++) {
            try {
                if ((numer[i]%2) !=0)
                    throw new 
                        Lesson11Exception (numer[i], denom[i]);

                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("Can't devide by Zero!.");
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("No matching element found.");
            }
            catch (Lesson11Exception exc) {
                System.out.println(exc);
            }
        }
        System.out.println("\n");
    }
}

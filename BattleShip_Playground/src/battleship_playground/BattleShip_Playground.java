/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship_playground;

import citbyui.cit260.battleship_playground.lesson06.WendellLesson6;
import citbyui.cit260.battleship_playground.lesson09.Grasshopper;
import citbyui.cit260.battleship_playground.lesson09.Ladybug;
import citbyui.cit260.battleship_playground.lesson09.Insect;
import citbyui.cit260.battleship_playground.lesson11.Lesson11;
import java.util.Scanner;

/**
 *
 * @author tannerwe
 */
public class BattleShip_Playground {
   //Creating Instance Variable
   String PlayerOne;
   String PlayerTwo;
   String name;
   String instructions = "Welcome to the game of Battleship! \n\n"
           + "Player 1 and Player 2 will be competing with each other. \n"
           + "Each Player will be given the oppurtunity to hid their ships. \n"
           + "While hiding your ships the opposite player must be honest and look away. \n"
           + "After you have completed your turn the next player will have to enter [n] to view his/or her board."
           + "Additional instructions will be added later..\n"
           + "Good Luck!";
           
    public static void main(String[] args) {
        BattleShip_Playground myGame = new BattleShip_Playground();
        //myGame.getName();
        //myGame.displayHelp();
        
        //Lesson 11
        Lesson11 lessElev = new Lesson11();
        lessElev.displayExcepExamp();
        
        List shipDetail = new List();
        shipDetail.myList();
        
        //Wendell's Assignment 6
        WendellLesson6 newAssign = new WendellLesson6();
        newAssign.totHits();
        
        // Wendell's Lesson 09
        Insect grassH = new  Grasshopper();
        System.out.println("A " + ((Grasshopper)grassH).iName + " has " + grassH.nEyes + " eyes. \n");
        
        Insect ladyB = new  Ladybug();
        System.out.println("A " + ((Ladybug)ladyB).iName + " has " + ladyB.nEyes + " eyes. \n");
    }
    public void getName()    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        this.name = input.next();
    }
    public void displayHelp()   {
        System.out.println("\n Welcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}

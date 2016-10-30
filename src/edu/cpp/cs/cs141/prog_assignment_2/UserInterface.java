/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cpp.cs.cs141.prog_assignment_2;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class UserInterface {
    private GameEngine gameEngine;
    private Scanner scan;
    
    public UserInterface(GameEngine game){
       this.gameEngine = game;
       this.scan = new Scanner(System.in);       
    }
    public void startGameLoop(){
        System.out.println("Welcome to Escape the Dungeon!");
        weaponMenu();
        
        
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter a numeric value 1 , 2, or 3");
            weaponMenu();
            scan.next();
        }
        
        int weaponChoice = scan.nextInt();
        setWeapon(weaponChoice);
        gameEngine.getWeaponName();    
        
        while (!gameEngine.gameStatus()) {
            System.out.println("Walking one step");
            if (gameEngine.randomEncounter()) {
                gameEngine.startEncounter();
                System.out.println("Type 1 to fight or 2 attempt to escape ");
                while (!scan.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a numeric value 1 or 2");
                    scan.next();
                }
                int encounterChoice = scan.nextInt();
                if (encounterChoice == 1) {
                    gameEngine.startFight(encounterChoice);
                }
                else{
                    
                }
                
            }
            
        }
        
       
    }
    
    public void setWeapon(int weapon){
        gameEngine.setWeapon(weapon);
   }
    
    public void weaponMenu(){
        
            System.out.println("Type 1 for Pistol Acrracy: 75% Damage: 1 Max Ammo: 15");
            System.out.println("Type 2 for Rifle Acrracy: 65% Damage: 2 Max Ammo: 10");
            System.out.println("Type 3 for Shotgun Acrracy: 40% Damage: 5 Max Ammo: 5");
    }
    
    
}

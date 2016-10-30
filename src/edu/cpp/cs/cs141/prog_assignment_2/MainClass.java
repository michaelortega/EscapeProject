/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cpp.cs.cs141.prog_assignment_2;

/**
 *
 * @author Michael
 */
public class MainClass {
    public static void main(String[] args) {
        GameEngine gameEngine = new GameEngine();
        UserInterface UI = new UserInterface(gameEngine);
        UI.startGameLoop();
    }
}

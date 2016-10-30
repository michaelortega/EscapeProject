package edu.cpp.cs.cs141.prog_assignment_2;

import java.util.Random;

public class GameEngine {

    Player player = new Player();

    private boolean gameOver = false;

//    public void playerShootWeapon(){
//         player.shoot();
//    }
    public void getWeaponName() {

        player.currentGun();
    }

    public boolean gameStatus() {
        return gameOver;
    }
    
    public void takeAStep(){
        player.takeStep();
    }
    public void setWeapon(int weapon) {
        switch (weapon) {
            case 1:
                Pistol pistol = new Pistol();
                player.setWeapon(pistol);
                break;
            case 2:
                Rifle rifle = new Rifle();
                player.setWeapon(rifle);
                break;
            case 3:
                Shotgun shotgun = new Shotgun();
                player.setWeapon(shotgun);
                break;
        }

    }

    public boolean randomEncounter() {
        Random r = new Random();
        int random = r.nextInt(100-1)+1;
        return random <= 15;
    }

    void startEncounter() {
        
    }

    void startFight(int encounterChoice) {
        
    }
}


package edu.cpp.cs.cs141.prog_assignment_2;

public class Player implements ActiveAgents{
    private Gun selectedGun;
    public static int playerHealth  = 0;
    private int currentStep = 0;
    
    public Player(){
       playerHealth = 20;
    }
    
    @Override
    public void takeDamage(int damageTaken) {
         playerHealth = playerHealth - damageTaken;
    }
    
    public void setWeapon(Gun g ){
        selectedGun = g;
    }
    
    public void increaseHealth(int increaseAmount){
        playerHealth = playerHealth + increaseAmount;
    }
    
    public void currentGun(){
        System.out.println(selectedGun.weaponName +  " selected!");
    }

    public boolean shoot() {
        return selectedGun.calculateHit();
    }

    void takeStep() {
        currentStep+=1;
    }
    
    public int getCurrentStep(){
        return currentStep;
    }
   

}

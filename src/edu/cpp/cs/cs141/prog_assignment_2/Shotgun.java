package edu.cpp.cs.cs141.prog_assignment_2;

import java.util.Random;

public class Shotgun extends Gun{
    private static int shotgunMaxAmmo = 5;
    private static final int shotgunAccuracy = 40;
    private static final int shotgunDamage = 5;
    private static final String shotgunName = "shotgun";

    public Shotgun() {
        super(shotgunMaxAmmo, shotgunAccuracy, shotgunDamage, shotgunName);
    }
    
    @Override
    public boolean calculateHit() {
        Random random = new Random();
        int randomNumber = random.nextInt(100 - 1) + 1;
        return randomNumber <= shotgunAccuracy;
    }

}

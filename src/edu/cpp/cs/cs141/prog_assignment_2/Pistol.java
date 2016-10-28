package edu.cpp.cs.cs141.prog_assignment_2;

import java.util.Random;

public class Pistol extends Gun {

    private static final int pistolMaxAmmo = 15;
    private static final int pistolAccuracy = 75;
    private static final int pistolDamage = 1;

    public Pistol(int ammo, int accuracy, int gunDamage) {
        super(pistolMaxAmmo, pistolAccuracy, pistolDamage);
    }

    @Override
    public boolean calculateHit() {
        Random random = new Random();
        int randomNumber = random.nextInt(100 - 1) + 1;
        return randomNumber <= pistolAccuracy;
    }

}

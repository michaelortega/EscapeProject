package edu.cpp.cs.cs141.prog_assignment_2;

import java.util.Random;

public class Rifle extends Gun {

    private static final int rifleMaxAmmo = 10;
    private static final int rifleAccuracy = 65;
    private static final int rifleDamage = 2;

    public Rifle(int Ammo, int accuracy, int gunDamage) {
        super(rifleMaxAmmo,rifleAccuracy,rifleDamage);
    }

    @Override
    public boolean calculateHit() {
        Random random = new Random();
        int randomNumber = random.nextInt(100 - 1) + 1;
        return randomNumber <= rifleAccuracy;
    }
    //heey

}

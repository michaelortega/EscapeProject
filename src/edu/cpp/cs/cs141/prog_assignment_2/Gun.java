package edu.cpp.cs.cs141.prog_assignment_2;

public abstract class Gun {

    private final int ammo; // static?
    private final int gunAccuracy;
    private final int gunDamage;
    public String weaponName ="";

    public Gun(int ammo, int accuracy, int gunDamage, String gunName) {
        this.ammo = ammo;
        this.gunAccuracy = accuracy;
        this.gunDamage = gunDamage;
        weaponName = gunName;
    }

    public abstract boolean calculateHit();
}

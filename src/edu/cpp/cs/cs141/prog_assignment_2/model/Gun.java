package edu.cpp.cs.cs141.prog_assignment_2.model;

public class Gun {

    private final int ammo;
    private final int gunAccuracy;
    private final int gunDamage;
    private final String weaponName;

    public Gun(String gunName, int ammo, int accuracy, int gunDamage) {
    	this.weaponName = gunName;
        this.ammo = ammo;
        this.gunAccuracy = accuracy;
        this.gunDamage = gunDamage;
    }

	public int getAmmo() {
		return ammo;
	}

	public int getAccuracy() {
		return gunAccuracy;
	}

	public int getDamage() {
		return gunDamage;
	}

	public String getName() {
		return weaponName;
	}

}

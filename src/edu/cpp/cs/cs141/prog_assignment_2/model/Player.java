package edu.cpp.cs.cs141.prog_assignment_2.model;

import java.util.Optional;

public class Player {
	private Optional<Gun> gun;

	public Optional<Gun> getGun() {
		return this.gun;
	}

	public void setGun(Gun gun) {
		this.gun = Optional.ofNullable(gun);
	}
}

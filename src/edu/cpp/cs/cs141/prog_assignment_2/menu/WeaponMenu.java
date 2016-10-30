package edu.cpp.cs.cs141.prog_assignment_2.menu;

import java.util.Map.Entry;
import java.util.stream.Collectors;

import edu.cpp.cs.cs141.prog_assignment_2.model.Gun;
import edu.cpp.cs.cs141.prog_assignment_2.model.Player;
import edu.cpp.cs.cs141.prog_assignment_2.service.PathGenerationService;
import edu.cpp.cs.cs141.prog_assignment_2.service.WeaponSelectionService;

public class WeaponMenu implements Menu {
	
	private final Player player;
	private final WeaponSelectionService weapons;
	private final PathGenerationService pathGenerationService;

	public WeaponMenu(Player player, WeaponSelectionService weapons, PathGenerationService pathGenerationService) {
		this.player = player;
		this.weapons = weapons;
		this.pathGenerationService = pathGenerationService;
	}

	@Override
	public String display() {
		return this.weapons.findAllGuns().entrySet().stream().map(this::entryToOption).collect(Collectors.joining(System.lineSeparator()));
	}

	@Override
	public Menu react(String input) {
		try {
			this.player.setGun(this.weapons.findGunById(Integer.parseInt(input)).orElse(null));
			return new TakeStepMenu(this.pathGenerationService, this.player);
		} catch(Exception e) {
			return this;
		}
	}
	
	private String entryToOption(Entry<Integer, Gun> entry) {
		int id = entry.getKey();
		Gun gun = entry.getValue();
		return String.format("Type %d for %s. Accuracy: %d. Damage: %d. Max Ammo: %d", id, gun.getName(), gun.getAccuracy(), gun.getDamage(), gun.getAmmo());
	}

}

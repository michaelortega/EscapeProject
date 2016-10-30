package edu.cpp.cs.cs141.prog_assignment_2.service;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.cpp.cs.cs141.prog_assignment_2.model.Gun;

public class WeaponSelectionService {
	// Should be loaded from some data source.
	private final Map<Integer, Gun> guns = Collections.unmodifiableMap(Stream.of(
				new AbstractMap.SimpleEntry<>(1, new Gun("Pistol", 15, 75, 1)),
				new AbstractMap.SimpleEntry<>(2, new Gun("Rifle", 10, 65, 2)),
				new AbstractMap.SimpleEntry<>(3, new Gun("Shotgun", 5, 40, 5))
			).collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue)));
	
	public Optional<Gun> findGunById(int id) {
		return Optional.ofNullable(this.guns.get(id));
	}
	
	public Map<Integer, Gun> findAllGuns() {
		return this.guns;
	}
}

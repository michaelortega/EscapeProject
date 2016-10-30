package edu.cpp.cs.cs141.prog_assignment_2.service;

import java.util.Random;

import edu.cpp.cs.cs141.prog_assignment_2.menu.FighOrFlightMenu;
import edu.cpp.cs.cs141.prog_assignment_2.menu.Menu;
import edu.cpp.cs.cs141.prog_assignment_2.menu.TakeStepMenu;
import edu.cpp.cs.cs141.prog_assignment_2.model.Player;

public class PathGenerationService {
	private final Random random = new Random();
	
	public Menu getNextMenu(Player player) {
		int number = this.random.nextInt(100); // 0-99
		if(number < 15) {
			return new FighOrFlightMenu(this, player);
		}
		return new TakeStepMenu(this, player);
	}
}

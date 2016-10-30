package edu.cpp.cs.cs141.prog_assignment_2.menu;

import edu.cpp.cs.cs141.prog_assignment_2.model.Player;
import edu.cpp.cs.cs141.prog_assignment_2.service.PathGenerationService;

public class FighOrFlightMenu implements Menu {

	private final PathGenerationService pathGenerationService;
	private final Player player;

	public FighOrFlightMenu(PathGenerationService pathGenerationService, Player player) {
		this.pathGenerationService = pathGenerationService;
		this.player = player;
	}

	@Override
	public String display() {
		return "Type 1 to fight or 2 attempt to escape.";
	}

	@Override
	public Menu react(String input) {
		try {
			int selection = Integer.parseInt(input);
			if(selection == 1) {
				// Implement fight.
				return null; // TODO: Fix this.
			} else if (selection == 2) {
				// Implement run.
				return null; // TODO: Fix this.
			}
			return this;
		} catch(Exception e) {
			return this;
		}
	}

}

package edu.cpp.cs.cs141.prog_assignment_2.menu;

import edu.cpp.cs.cs141.prog_assignment_2.model.Player;
import edu.cpp.cs.cs141.prog_assignment_2.service.PathGenerationService;

public class TakeStepMenu implements Menu {

	private final Player player;
	private final PathGenerationService pathGenerationService;

	public TakeStepMenu(PathGenerationService pathGenerationService, Player player) {
		this.pathGenerationService = pathGenerationService;
		this.player = player;
	}

	@Override
	public String display() {
		return "Taking a step... Press anything to continue.";
	}

	@Override
	public Menu react(String input) {
		return this.pathGenerationService.getNextMenu(player);
	}

}

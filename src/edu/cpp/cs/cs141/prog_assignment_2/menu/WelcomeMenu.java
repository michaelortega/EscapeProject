package edu.cpp.cs.cs141.prog_assignment_2.menu;

public class WelcomeMenu implements Menu {
	
	@Override
	public String display() {
		return "Welcome to Escape the Dungeon!";
	}

	@Override
	public Menu react(String input) {
		return null;
	}

}

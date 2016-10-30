package edu.cpp.cs.cs141.prog_assignment_2;

import java.util.Scanner;

import edu.cpp.cs.cs141.prog_assignment_2.menu.Menu;
import edu.cpp.cs.cs141.prog_assignment_2.menu.WeaponMenu;
import edu.cpp.cs.cs141.prog_assignment_2.menu.WelcomeMenu;
import edu.cpp.cs.cs141.prog_assignment_2.model.Player;
import edu.cpp.cs.cs141.prog_assignment_2.service.PathGenerationService;
import edu.cpp.cs.cs141.prog_assignment_2.service.WeaponSelectionService;

/**
 *
 * @author Michael
 */
public class MainClass {
    public static void main(String[] args) {
    	WeaponSelectionService weaponSelectionService = new WeaponSelectionService();
    	PathGenerationService pathGenerationService = new PathGenerationService();
    	Player player = new Player();
    	
		Menu current = new WelcomeMenu();
		current.display(); // Display welcome menu.
		current = new WeaponMenu(player, weaponSelectionService, pathGenerationService); // First call to action

		try(Scanner in = new Scanner(System.in)){
			do {
				current.display();
				current = current.react(in.nextLine());
			} while (current != null);
    	}
    }
}

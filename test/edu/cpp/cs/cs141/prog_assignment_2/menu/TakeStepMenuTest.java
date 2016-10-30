package edu.cpp.cs.cs141.prog_assignment_2.menu;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cpp.cs.cs141.prog_assignment_2.model.Player;
import edu.cpp.cs.cs141.prog_assignment_2.service.PathGenerationService;

public class TakeStepMenuTest {

	@Test
	public void reactHandlesNullInput() {
		Menu subject = new TakeStepMenu(new PathGenerationService(), new Player());
		
		assertNotNull(subject.react(null));
	}
	
	@Test
	public void reactHandlesEmptyStringInput() {
		Menu subject = new TakeStepMenu(new PathGenerationService(), new Player());
		
		assertNotNull(subject.react(""));
	}
	
	@Test
	public void reactHandlesGarbageStringInput() {
		Menu subject = new TakeStepMenu(new PathGenerationService(), new Player());
		
		assertNotNull(subject.react("!@#$%^&*(\n\r\\asdasd"));
	}

}

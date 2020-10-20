package uk.ac.qub.eeecs.dave;

import static org.junit.jupiter.api.Assertions.*;
import uk.ac.qub.eeecs.dave.Calculator;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		uk.ac.qub.eeecs.dave.Calculator c = new uk.ac.qub.eeecs.dave.Calculator();
		assertEquals(c.add(10,1), 11);
	}
	
	@Test
	void testSub() {
		uk.ac.qub.eeecs.dave.Calculator c = new uk.ac.qub.eeecs.dave.Calculator();
		assertEquals(c.sub(10,1), 9);
	}
}

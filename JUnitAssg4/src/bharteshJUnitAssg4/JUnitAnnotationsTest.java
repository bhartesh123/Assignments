package bharteshJUnitAssg4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitAnnotationsTest {
	JUnitAnnotations Junit;
	@BeforeEach
	void init() {
		Junit=new JUnitAnnotations();
		System.out.println("Before Each Test this @BeforeEach is Executed");
	}
	@AfterEach
	void clean() {
		System.out.println("After Each is Executed Cleaning up....\n\n");
	}
	@BeforeAll
	static void before1() {
		System.out.println("Before All Annotation\n");
	}
	@AfterAll
	static void after() {
		System.out.println("\nEnd of Coding.......!");
	}
	/*
	 * public void display() { Junit.add(10,20); }
	 */
	@Test
	@DisplayName("This is for Add")
	void test1() {
		int expected=90;
		int actual=Junit.add(10,80);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("This is for Multiply")
	void test2() {
		int expected=800;
		int actual=Junit.multiply(10,80);
		assertEquals(expected, actual);
	}


}

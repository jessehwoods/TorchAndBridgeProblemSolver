package problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class SideTest {
	
	priavte static int[] emptySide = {};
	private static int emptySideSize = 0;
	private static String emptySideString = "[]";
	
	private static int[] firstSide = {1, 3, 5};
	private static int firstSideSize = 3;
	private static String firstSideString = "[1,3,5]";
	
	private static int[] secondSide = {2, 4, 6, 7};
	private static int secondSideSize = 4;
	private static String secondSideString = "[2,4,6,7]";

	@Test
	public void testConstructor() {
		//Paramaterized constructor
		Side sideA = new Side(emptySide);
		assertEquals(emptySideSize, sideA.size());
		assertEquals(emptySideString, sideA.toString());				
		
		Side sideB = new Side(firstSide);
		assertEquals(firstSideSize, sideB.size());
		assertEquals(firstSideString, sideB.toString());
		
		Side sideC = new Side(secondSide);
		assertEquals(secondSideSize, sideC.size());
		assertEquals(secondSideString, sideC.toString());
		
		//Try default constructor
		Side sideD = new Side();
		assertEquals(emptySideSize, sideD.size());
		assertEquals(emptySideString, sideD.toString());
		
	}
	
	

}

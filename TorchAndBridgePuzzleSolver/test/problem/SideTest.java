package problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class SideTest {
	
	/**
	 * Array and expected returns for an empty Side. Should also match the default constructor.
	 */
	private static int[] emptySide = {};
	private static int emptySideSize = 0;
	private static String emptySideString = "[]";
	
	/**
	 * Array and expected returns of a Side to use in testing.
	 */
	private static int[] firstSide = {2, 8};
	private static int firstSideSize = 2;
	private static String firstSideString = "[2,8]";
	
	/**
	 * Array and expected returns fo a Side to use in testing.
	 */
	private static int[] secondSide = {3, 7, 9, 10};
	private static int secondSideSize = 4;
	private static String secondSideString = "[3,7,9,10]";
	private static String secondSideStringMinusFirst = "[7,9,10]";
	private static String secondSideStringMinusMiddle = "[3,9,10]";
	private static String secondSideStringMinusLast = "[3,7,9]";
	
	/**
	 * Integers that can be added to the firt, middle, and last location in either side 
	 * above, assuming sorted order.
	 */
	private static int firstInt = 1;
	private static String firstSideStringPlusFirst = "[1,2,8]";
	private static int middleInt = 4;
	private static String firstSideStringPlusMiddle = "[2,4,8]";
	private static int lastInt = 11;
	private static String firstSideStringPlusLast = "[2,8,11]";
	
	@Test
	public void testConstructors() {
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
	
	@Test
	public void testAddToEmpty() {
		Side sideA = new Side();
		assertEquals(emptySideSize, sideA.size());
		assertEquals(emptySideString, sideA.toString());				
		
		//Add first
		sideA.add(firstInt);
		assertEquals(emptySideSize + 1, sideA.size());
		assertEquals("[" + firstInt + "]", sideA.toString());				
		
		//Add last
		sideA.add(lastInt);
		assertEquals(emptySideSize + 2, sideA.size());
		assertEquals("[" + firstInt + "," + lastInt + "]", sideA.toString());
		
		//Add to middle
		sideA.add(middleInt);
		assertEquals(emptySideSize + 3, sideA.size());
		assertEquals("[" + firstInt + "," + middleInt + "," + lastInt + "]", sideA.toString());

	}
	
	@Test
	public void testAddFirst() {
		Side sideA = new Side(firstSide);
		assertEquals(firstSideSize, sideA.size());
		assertEquals(firstSideString, sideA.toString());				
		
		sideA.add(firstInt);
		assertEquals(emptySideSize + 1, sideA.size());
		assertEquals(firstSideStringPlusFirst, sideA.toString());	
	}
	
	@Test
	public void testAddMiddle() {
		Side sideA = new Side(firstSide);
		assertEquals(firstSideSize, sideA.size());
		assertEquals(firstSideString, sideA.toString());				
		
		sideA.add(firstInt);
		assertEquals(emptySideSize + 1, sideA.size());
		assertEquals(firstSideStringPlusMiddle, sideA.toString());
	}
	
	@Test
	public void testAddLast() {
		Side sideA = new Side(firstSide);
		assertEquals(firstSideSize, sideA.size());
		assertEquals(firstSideString, sideA.toString());				
		
		sideA.add(firstInt);
		assertEquals(emptySideSize + 1, sideA.size());
		assertEquals(firstSideStringPlusLast, sideA.toString());
	}
	
	@Test
	public void testRemoveFromEmpty() {
		//Should throw an exception if removing something from a list Side that isn't in the side
		Side sideA = new Side();
		assertEquals(emptySideSize, sideA.size());
		assertEquals(emptySideString, sideA.toString());
		
		try {
			sideA.remove(firstInt);
			fail();
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
	
	@Test
	public void testRemoveFirst() {
		Side sideA = new Side(secondSide);
		assertEquals(secondSideSize, sideA.size());
		assertEquals(secondSideString, sideA.toString());
		
		sideA.remove(secondSide[0]);
		assertEquals(secondSideSize - 1, sideA.size());
		assertEquals(secondSideStringMinusFirst, sideA.toString());
	}
	
	@Test
	public void testRemoveMiddle() {
		Side sideA = new Side(secondSide);
		assertEquals(secondSideSize, sideA.size());
		assertEquals(secondSideString, sideA.toString());
		
		sideA.remove(secondSide[1]);
		assertEquals(secondSideSize - 1, sideA.size());
		assertEquals(secondSideStringMinusLast, sideA.toString());
	}
	
	@Test
	public void testRemoveLast() {
		//TODO
	}
	
	@Test
	public void testMoveToEmpty() {
		//TODO	
	}
	
	@Test
	public void testMoveToFirst() {
		//TODO
	}
	
	@Test
	public void testMoveToMiddle() {
		//TODO
	}
	
	@Test
	public void testMoveToLast() {
		//TODO
	}
	
	@Test
	public void testInvalidMoveFromEmpty() {
		//TODO
	}
	
	@Test
	public void testInvalidMoveFirst() {
		//TODO
	}
	
	@Test
	public void testInvalidMoveMiddle() {
		//TODO
	}
	
	@Test
	public void testInvalidMoveLast() {
		//TODO
	}
	
	@Test
	public void testMoveToDuplicate() {
		//TODO
	}
	
	@Test
	public void testMoveFromDuplicate() {
		//TODO
	}

}

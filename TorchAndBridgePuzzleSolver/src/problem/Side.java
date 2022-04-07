package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds information on the sides of the bridge and methods allow the movers to be moved from one
 * Side to another.
 * Movers on a side are stored as ints representing their speed. 
 * Position in the array is used to distinguish different movers with the same speed. 
 * 
 * @author Jesse Woods
 *
 */
public class Side {
	
	/**
	 * Array holding the movers that are on this side of the bridge. Int value represents 
	 * the speed of the mover. Kept in ascending order.
	 */
	private List<Integer> movers;
	
	/**
	 * Default constructor that creates an empty Side.
	 */
	public Side() {
		this.movers = new ArrayList<Integer>();
	}
	
	/**
	 * Parameterized constructor that accepts a list of movers to indlude in this side.
	 * @param moversToInclude
	 */
	public Side(int[] moversToInclude) {
		
	}
	
	/**
	 * Moves a mover from this Side to another Side, specified by index.
	 * @param movers is the values to be moved.
	 * @param moveToHere is the Side that is going to have a mover sent to.
	 */
	public void moveTo(int[] movers, Side moveToHere) {
		
	}
	

	/**
	 * Accepts a mover from the provided side and adds it to this Side. 
	 * @param movers is the values to be moved.
	 * @param moveFromHere is the Side to move from to this one.
	 */
	public void moveFrom(int[] movers, Side moveFromHere) {
		
	}

	
	/**
	 * Returns the number of movers kept in this side.
	 * @return the number of movers in this Side
	 */
	public int size() {
		
	}
	
	
	
}

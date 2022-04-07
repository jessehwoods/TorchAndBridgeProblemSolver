package problem;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Holds information on the sides of the bridge and methods allow the movers to be moved from one
 * Side to another.
 * Movers on a side are stored as integers representing their speed. They can be duplicates, but duplicates are not
 * distinguished from each other in any way. 
 * 
 * @author Jesse Woods
 *
 */
public class Side {
	
	/**
	 * Map holding the movers that are on this side of the bridge. 
	 * Key represents the speed of the mover. Maintained in sorted order.
	 * Value represents how many of that speed there is, since a problem might involve multiples of the same speed.
	 */
	private Map<Integer, Integer> movers;
	
	/**
	 * Default constructor that creates an empty Side.
	 */
	public Side() {
		this.movers = new TreeMap<Integer, Integer>();
	}
	
	/**
	 * Parameterized constructor that accepts a list of movers to indlude in this side.
	 * @param moversToInclude
	 */
	public Side(int[] moversToInclude) {
		
	}
	
	/**
	 * Moves a group of movers from this Side to another Side specified by integer value of the
	 * movers.
	 * @param movers is the values to be moved.
	 * @param moveToHere is the Side that is going to have a mover sent to.
	 */
	public void moveTo(int[] movers, Side moveToHere) {
		
	}
	
	/**
	 * Returns the number of movers kept in this side.
	 * @return the number of movers in this Side
	 */
	public int size() {
		
	}	
	
	/**
	 * Adds a mover to this Side.
	 * @param mover
	 */
	public void add(int mover) {
		
	}
	
	/**
	 * Removes a mover from this Side.
	 * @param mover
	 */
	public void remove(int mover) {
		
	}

	@Override
	public String toString() {
		StringBuilder returnThisString = new StringBuilder(); 
		returnThisString.append("[");
		Set<Entry<Integer, Integer>> entries = movers.entrySet();
		for (Entry e : entries) {
			
		}
		returnThisString.append("]");
		return returnThisString.toString();
	}
	

	
}

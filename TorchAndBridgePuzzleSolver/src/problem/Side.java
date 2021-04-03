package problem;

/**
 * Holds information on the sides of the bridge and methods allow the movers to be moved from one
 * Side to another.
 * Movers on a side are stored as ints representing their speed, sorted in ascending order. 
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
	private int[] movers;

}

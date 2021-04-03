package problem;

/**
 * Object holding a problem state for a torch and bridge puzzle. 
 * Movers are stored as ints, representing their speed, stored in arrays, representing the start and end sides of the bridge.
 * The torch position is tracked as a string that is either "Start Side" or "Target Side."
 * The time spent moving so far is stored as an int.
 * 
 * @author Jesse Woods
 *
 */
public class Problem {
	
	/**
	 * Array holding the Movers on the start side as ints representing their
	 * speed. In ascending order of value.
	 */
	private Side startSide;
	
	/**
	 * An array holding the Movers on the target side as ints representing their
	 * speed.
	 */
	private Side targetSide;
	
	/**
	 * Tracks position of the torch. Uses an array that contains the 
	 */
	private String torchLocation;
	
	/**
	 * Tracks how much time has been spent moving so far.
	 */
	private int timeSpent;

}

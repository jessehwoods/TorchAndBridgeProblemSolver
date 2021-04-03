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
	private Location torchLocation;
	
	/**
	 * Tracks how much time has been spent moving so far.
	 */
	private int timeSpent;

	/**
	 * Constructor for a problem object giving a starting Array of numbers to
	 * represent the movers.
	 */
	public Problem(int[] startSide) {
		
	}
	
	//TODO: Finish paramaterized constructor.
	public Problem(int[] startSide, int[] targetSide, int timeSpent, ) {
		
	}
	
	
	private Side getStartSide() {
		return startSide;
	}



	private void setStartSide(Side startSide) {
		this.startSide = startSide;
	}



	private Side getTargetSide() {
		return targetSide;
	}



	private void setTargetSide(Side targetSide) {
		this.targetSide = targetSide;
	}



	private Location getTorchLocation() {
		return torchLocation;
	}



	private void setTorchLocation(Location torchLocation) {
		this.torchLocation = torchLocation;
	}



	private int getTimeSpent() {
		return timeSpent;
	}



	private void setTimeSpent(int timeSpent) {
		this.timeSpent = timeSpent;
	}



	private enum Location {
		START_SIDE,
		TARGET_SIDE
	}

}

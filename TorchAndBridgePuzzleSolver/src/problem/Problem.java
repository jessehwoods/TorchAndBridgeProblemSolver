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
	 * A Side object representing the starting section of the problem.
	 */
	private Side startSide;
	
	/**
	 * A Side object representing the area that people need to be moved to in the problem.
	 */
	private Side targetSide;
	
	/**
	 * Tracks position of the torch as an enum defining possible locations.
	 */
	private Location torchLocation;
	
	/**
	 * Tracks how much time has been spent moving so far.
	 */
	private int timeSpent;

	/**
	 * A parameterized constructor for the Problem object. 
	 * @param startSide
	 * @param targetSide
	 * @param timeSpent
	 * @param torchLocation
	 */
	public Problem(int[] startSide, 
			int[] targetSide, 
			int timeSpent, 
			Location torchLocation) {
		
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
	
	public enum Location{
		START_SIDE,
		TARGET_SIDE;
	}

}

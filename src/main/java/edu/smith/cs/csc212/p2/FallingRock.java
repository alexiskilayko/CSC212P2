package edu.smith.cs.csc212.p2;

/**
 * A new type of rock that falls instead of staying still.
 * @author alexiskilayko
 *
 */
public class FallingRock extends Rock {
/**
 * Inherit same features from Rock class.
 * @param world
 */
	public FallingRock(World world) {
		super(world);
	}

	@Override
	public void step () {
		this.moveDown();
	}
	/**
	 * Override step method so that rock moves down.
	 */

}

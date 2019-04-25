package edu.smith.cs.csc212.p2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * Most Fish behavior lives up in WorldObject (a Fish just looks special!).
 * Or it is in PlayFish, where the missing/found and player fish all act different!
 * 
 * @author jfoley
 */
public class Fish extends WorldObject {
	/**
	 * This is the number of points a fish is worth.
	 */
	int points;
	/**
	 * Whether or not this is the player;
	 */	
	boolean player = false;
	/**
	 * Whether or not the fish gets scared fast.
	 */
	public boolean fastScared;
	/**
	 * Random
	 */
    Random random = new Random();
;
	/**
	 * Called only on the Fish that is the player!
	 */
	public void markAsPlayer() {
		this.player = true;
	}
	
	/**
	 * A Fish knows what World it belongs to, because all WorldObjects do.
	 * @param color Color by number.
	 * @param world The world itself.
	 */
	public Fish(int color, World world) {
		super(world);
		// Randomize whether or not the fish is fastScared.*/
		this.fastScared = random.nextBoolean();
	}
	
	/**
	 * Animate our fish by facing left and then right over time.
	 */
	private int dt = 0;
	
	/**
	 * Go ahead and ignore this method if you're not into graphics.
	 * We use "dt" as a trick to make the fish change directions every second or so; this makes them feel a little more alive.
	 */
	@Override
	public void draw(Graphics2D g) {
		dt += 1;
		if (dt > 100) {
			dt = 0;
		}
		g.setColor(Color.yellow);
		g.fill(new Ellipse2D.Double(-0.4, -0.4, 0.8, 0.8));
	}
	
	@Override
	public void step() {
		// Fish are controlled at a higher level; see FishGame.
	}
}

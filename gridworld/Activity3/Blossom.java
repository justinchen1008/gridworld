//package info.gridworld.actor;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;

public class Blossom extends Flower
{
	private static final Color DEFAULT_COLOR = Color.GREEN;
    	private static final double DARKENING_FACTOR = 0.05;
    	private int lifeTime;
    
    	public Blossom(){
		super(DEFAULT_COLOR);
		lifeTime = 10;
	}	
	
	public Blossom(int i){
		super(DEFAULT_COLOR);
		lifeTime = i;
	}

	public void act()
	{
		if(lifeTime == 0){
			removeSelfFromGrid();
		}
		Color c = getColor();
		int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
		int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
		int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

		setColor(new Color(red, green, blue));
		lifeTime--;
	}
	
}

package info.gridworld.actor;

import java.awt.Color;

public class Blossom extends Flower
{
	private static final Color DEFAULT_COLOR = Color.GREEN;
    //private static final double DARKENING_FACTOR = 0.05;
    private int lifeTime;
    
    public Blossom(){
		super(DEFAULT_COLOR);
		lifeTime = 10;
	}	
	
	public Blossom(int i){
		super(DEFAULT_COLOR);
		lifeTime = i;
	}
	
}

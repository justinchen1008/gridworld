import info.gridworld.actor;
import info.gridworld.grid.Location;


public class Boulder extends Actor
{
	private int lifeTime;
	private static final int THRESHOLD = 10;
	public Boulder(){
		lifeTime = (int)(Math.random()*200)
		setColor(null);
	}
	
	public void act(){
		lifeTime--;
		if(lifeTime < THRESHOLD){
			setColor(Color.RED);
		}
		if(lifeTime == -1){
			Kaboom k = new Kaboom();
			k.putSelfInGrid(getGrid(), loc);
		}
}

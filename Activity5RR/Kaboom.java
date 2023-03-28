import info.gridworld.actor.Actor;

public class Kaboom extends Actor
{
	private int lifeTime;
	private static final int THRESHOLD = 3;
	public Kaboom(){
		lifeTime = THRESHOLD;
		setColor(null);
	}
	public void act(){
		lifeTime--;
		if(lifeTime <= -1){
			removeSelfFromGrid();
		}
	}
}

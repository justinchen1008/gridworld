import info.gridworld.actor.Bug;

public class ZBug extends Bug{
    private int sideLength;
	private int tempLength;
	private int sideNum;
	private int turnCount;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        setDirection(90);
        sideLength = length;
        tempLength = 1;
        sideNum = 0;
        turnCount = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if(tempLength < sideLength && sideNum == 0){
			tempLength++;
			move();
			if(tempLength == sideLength){
				sideNum++;
				tempLength = 1;
			}
		}
		if(sideNum == 1 && turnCount < 3){
			turn();
		}else if(tempLength < sideLength && sideNum == 1){
			move();
			tempLength++;
			if(tempLength == sideLength){
				sideNum++;
				tempLength = 1;
				turnCount = 0;
			}
		}
		if(sideNum == 2 && turnCount < 5){
			turn();
			turnCount++;
		}else if(sideNum == 2 && tempLength < sideLength){
			move();
			tempLength++;
			if(tempLength == sideLength){
				sideNum++;
			}
		}
		if(sideNum > 2){
			return;
		}
    }
}

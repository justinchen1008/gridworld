import info.gridworld.actor.Bug;

public class ZBug extends Bug{
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        setDirection(90);
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        boolean CanMove = true;
        for(int i = 0; i < sideLength; i++){
            if(!CanMove){
                break;
            }
            if(canMove()){
                move();
            }else{
                CanMove = false;
            }
        }
        turn();
        turn();
        turn();
        for(int i = 0; i < sideLength; i++){
            if(!CanMove){
                break;
            }
            if(canMove()){
                move();
            }else{
                CanMove = false;
            }
        }
        for(int i= 0; i < 5; i++){
            turn();
        }
        for(int i = 0; i < sideLength; i++){
            if(!CanMove){
                break;
            }
            if(canMove()){
                move();
            }else{
                CanMove = false;
            }
        }
    }
}
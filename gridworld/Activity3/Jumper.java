//package info.gridworld.actor;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
//import info.gridworld.grid.Grid;
//import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class Jumper extends Bug
{
    private int turnCounter = 0;

    public Jumper(){
        super(Color.BLUE);
    }

    public void move(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Blossom b = new Blossom();
        b.putSelfInGrid(gr, loc);
    }

    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower) || (neighbor instanceof Blossom);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }

    public void act(){
        if(turnCounter < 8) {
            if (canMove()) {
                move();
                turnCounter = 0;
            } else {
                turn();
                turnCounter++;
            }
        }
    }

}

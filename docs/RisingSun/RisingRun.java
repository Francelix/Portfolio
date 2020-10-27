
/**
 * A program that introduces an animation of the sun rising
 * 
 * @author (Francelix 
 * @version 10/26/2020
 */

import objectdraw.*;

public class RisingRun extends WindowController
{
    private FilledOval sun;
    private Text instructions;
    // The begin method is called when the program starts
   
   public void begin()
   {
       //create a new circle
       sun = new FilledOval(150,350,100,100,canvas);
       instructions = new Text("Please click the mouse repeatedly",20,20,canvas);
   }

    public void onMouseClick(Location point)
    {
        sun.move(0, -10);
        instructions.hide();
    }
    
    public void onMouseExit(Location point)
       {
        sun.moveTo(150,350);
        instructions.show();
    }
}
import greenfoot.*;  // Importing Greenfoot library

// How button class that extends Actor, allowing interaction with the world
public class how extends Actor
{
    // Act method is called repeatedly in each frame
    public void act()
    {
        // Check if this button has been clicked by the mouse
        if (Greenfoot.mouseClicked(this))
        {
            // If clicked, change the world to the "howtoplay" world (go to the instructions)
            Greenfoot.setWorld(new howtoplay());
        }
    }
}

import greenfoot.*;  // Importing Greenfoot library

// Quit button class that extends Actor, allowing interaction with the world
public class quit extends Actor
{
    // Act method is called repeatedly in each frame
    public void act()
    {
        // Check if this button has been clicked by the mouse
        if (Greenfoot.mouseClicked(this))
        {
            // If clicked, stop the Greenfoot simulation (quit the game)
            Greenfoot.stop();
        }
    }
}

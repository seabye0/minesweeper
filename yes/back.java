import greenfoot.*;  // Importing Greenfoot library

// Back button class that extends Actor, allowing interaction with the world
public class back extends Actor
{
    // Act method is called repeatedly in each frame
    public void act()
    {
        // Check if this button has been clicked by the mouse
        if (Greenfoot.mouseClicked(this))
        {
            // If clicked, change the world to the "main" world (go to the main menu)
            Greenfoot.setWorld(new main());
        }
    }
}

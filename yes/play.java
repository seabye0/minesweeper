import greenfoot.*;  // Importing Greenfoot library

// Play button class that extends Actor, allowing interaction with the world
public class play extends Actor
{
    // Act method is called repeatedly in each frame
    public void act()
    {
        // Check if this button has been clicked by the mouse
        if (Greenfoot.mouseClicked(this))
        {
            // If clicked, change the world to the "MyWorld" world (start the game)
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

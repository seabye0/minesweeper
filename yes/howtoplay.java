import greenfoot.*;  // Importing Greenfoot library

// The howtoplay world class that extends World, displaying the instructions screen for the game
public class howtoplay extends World
{
    // Constructor for the howtoplay world, initializes the world with size 600x400 and cell size 1
    public howtoplay()
    {    
        super(600, 400, 1);
        prepare();  // Prepare the world (add the "Back" button)
    }
    
    // Method to add objects (buttons) to the world
    public void prepare()
    {
        // Create and add the "Back" button
        back b = new back();
        GreenfootImage c = b.getImage();  // Get the image for the back button
        c.scale(90, 30);  // Scale the image to 90x30 pixels
        b.setImage(c);  // Set the resized image to the button
        addObject(b, 90, 350);  // Add the button to the world at the specified coordinates (90, 350)
    }
}

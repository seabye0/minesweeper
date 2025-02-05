import greenfoot.*;  // Importing Greenfoot library

// Main world class that extends World, creating the main menu for the game
public class main extends World
{
    // Constructor for the main world, initializes the world with size 600x400 and cell size 1
    public main()
    {    
        super(600, 400, 1);
        prepare();  // Prepare the world (add the buttons)
    }
    
    // Method to add objects (buttons) to the world
    public void prepare()
    {
        // Create and add the "Play" button
        play b = new play();
        GreenfootImage c = b.getImage();  // Get the image for the play button
        c.scale(90, 30);  // Scale the image to 90x30 pixels
        b.setImage(c);  // Set the resized image to the button
        addObject(b, 110, 210);  // Add the button to the world at the specified coordinates (110, 210)
        
        // Create and add the "How to Play" button
        how a = new how();
        c = a.getImage();  // Get the image for the how-to-play button
        c.scale(90, 30);  // Scale the image to 90x30 pixels
        a.setImage(c);  // Set the resized image to the button
        addObject(a, 110, 250);  // Add the button to the world at the specified coordinates (110, 250)
        
        // Create and add the "Quit" button
        quit d = new quit();
        c = d.getImage();  // Get the image for the quit button
        c.scale(90, 30);  // Scale the image to 90x30 pixels
        d.setImage(c);  // Set the resized image to the button
        addObject(d, 110, 290);  // Add the button to the world at the specified coordinates (110, 290)
    }
}

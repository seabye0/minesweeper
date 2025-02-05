import greenfoot.*;  // Importing the Greenfoot library

// MyWorld class, which extends Greenfoot's World class
public class MyWorld extends World
{
    // Constructor for MyWorld
    public MyWorld()
    {
        // Create a new world with 600x400 pixels and a cell size of 1x1 pixels
        super(600, 400, 1);  
        prepare();  // Call the prepare method to set up the world
    }

    // Method to set up the initial objects in the world
    public void prepare()
    {
        // Adding hidden secret walls before placing visible walls
        // These will teleport the player if they step on them
        addSecret(180,100);
        addSecret(220,100);
        addSecret(300,100);
        addSecret(380,100);
        addSecret(460,100);
        addSecret(220,140);
        addSecret(340,140);
        addSecret(380,140);
        addSecret(460,140);
        addSecret(140,180);
        addSecret(140,220);
        addSecret(180,220);
        addSecret(260,220);
        addSecret(340,220);
        addSecret(380,220);
        addSecret(460,220);
        addSecret(220,260);
        addSecret(340,260);
        addSecret(380,260);
        addSecret(420,260);
        addSecret(180,300);
        addSecret(220,300);
        addSecret(260,300);
        addSecret(380,300);
        addSecret(420,300);
        addSecret(500,300);

        // Adding visible walls that will hide the secret walls
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 100);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 140);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 180);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 220);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 260);
        }
        for(int i=0; i<11; i++)
        {
            addWall(100 + i * 40, 300);
        }

        // Creating and adding the finish object (goal)
        finish w = new finish();
        GreenfootImage c = w.getImage();
        c.scale(40,40);  // Resizing the finish object image
        w.setImage(c);
        addObject(w, 540, 100);  // Placing finish at (540, 100)

        // Creating and adding the start object
        start q = new start();
        c = q.getImage();
        c.scale(40,40);  // Resizing the start object image
        q.setImage(c);
        addObject(q, 100, 340);  // Placing start at (100, 340)

        // Creating and adding the player object
        player a = new player();
        c = a.getImage();
        c.scale(32,40);  // Resizing the player object image
        a.setImage(c);
        addObject(a, 100, 340);  // Placing player at (100, 340)
    }

    // Method to add a wall object at the given coordinates
    public void addWall(int x, int y)
    {
        wall b = new wall();
        GreenfootImage c = b.getImage();
        c.scale(40,40);  // Resizing the wall image
        b.setImage(c);
        addObject(b, x, y);  // Adding the wall to the world
    }

    // Method to add a secret teleporting wall at the given coordinates
    public void addSecret(int x, int y)
    {
        secret a = new secret();
        addObject(a, x, y);  // Adding the secret wall to the world (hidden under normal walls)
    }
}

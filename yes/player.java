import greenfoot.*;  // Importing Greenfoot library

// Player class that extends Actor, allowing it to interact with the world
public class player extends Actor
{
    int ok1 = 1;  // Variable to control movement (1 = active, 0 = stopped)
    int ok2 = 1;  // Variable to control winning badge display (1 = active, 0 = stopped)
    int i = 0;   // Counter for the number of times the player resets

    // Act method is called repeatedly in each frame
    public void act()
    {
        // References to different types of objects in the world
        Actor wall;
        Actor badge;
        Actor finish;
        Actor secret;

        // Get reference to the current world
        MyWorld world = (MyWorld) getWorld();

        // Display the reset count on the screen
        world.showText("Resets: " + i, 50, 25);

        // Check if movement is allowed (when ok1 == 1)
        if (ok1 == 1)
        {
            // Get the key that the player pressed
            String key = Greenfoot.getKey();

            // Handle "up" key movement
            if ("up".equals(key))
            {
                wall = getOneObjectAtOffset(0, -40, wall.class);  // Check for wall upwards
                finish = getOneObjectAtOffset(0, -40, finish.class);  // Check for finish line upwards
                secret = getOneObjectAtOffset(0, -40, secret.class);  // Check for secret object upwards

                // Move only if a wall or finish is present, but not if there's a secret
                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX(), getY() - 40); // Move up
                        setRotation(0);  // Face upwards
                    }
                    else
                    {
                        // If there's a secret, remove the wall and reset the player
                        world.removeObject(wall);
                        setLocation(100, 340);
                        i++;  // Increment reset count
                        setRotation(0);
                    }
                }
            }

            // Handle "down" key movement
            if ("down".equals(key))
            {
                wall = getOneObjectAtOffset(0, 40, wall.class);  // Check for wall downwards
                finish = getOneObjectAtOffset(0, 40, finish.class);  // Check for finish line downwards
                secret = getOneObjectAtOffset(0, 40, secret.class);  // Check for secret object downwards

                // Move only if a wall or finish is present, but not if there's a secret
                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX(), getY() + 40); // Move down
                        setRotation(180); // Face downwards
                    }
                    else
                    {
                        world.removeObject(wall);  // Remove wall if there's a secret
                        setLocation(100, 340);  // Reset player position
                        i++;  // Increment reset count
                        setRotation(0);  // Reset rotation
                    }
                }
            }

            // Handle "right" key movement
            if ("right".equals(key))
            {
                wall = getOneObjectAtOffset(40, 0, wall.class);  // Check for wall right
                finish = getOneObjectAtOffset(40, 0, finish.class);  // Check for finish line right
                secret = getOneObjectAtOffset(40, 0, secret.class);  // Check for secret object right

                // Move only if a wall or finish is present, but not if there's a secret
                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX() + 40, getY()); // Move right
                        setRotation(90); // Face right
                    }
                    else
                    {
                        world.removeObject(wall);  // Remove wall if there's a secret
                        setLocation(100, 340);  // Reset player position
                        i++;  // Increment reset count
                        setRotation(0);  // Reset rotation
                    }
                }
            }

            // Handle "left" key movement
            if ("left".equals(key))
            {
                wall = getOneObjectAtOffset(-40, 0, wall.class);  // Check for wall left
                finish = getOneObjectAtOffset(-40, 0, finish.class);  // Check for finish line left
                secret = getOneObjectAtOffset(-40, 0, secret.class);  // Check for secret object left

                // Move only if a wall or finish is present, but not if there's a secret
                if (wall != null || finish != null)
                {
                    if (secret == null)
                    {
                        setLocation(getX() - 40, getY()); // Move left
                        setRotation(-90); // Face left
                    }
                    else
                    {
                        world.removeObject(wall);  // Remove wall if there's a secret
                        setLocation(100, 340);  // Reset player position
                        i++;  // Increment reset count
                        setRotation(0);  // Reset rotation
                    }
                }
            }
        }

        // Check if the player has reached the finish
        finish = getOneObjectAtOffset(0, 0, finish.class);
        
        // If the player reaches the finish
        if (finish != null)
        {
            ok1 = 0;  // Stop movement (player has reached the finish)

            // Check if the secret and badge have already been shown
            if (ok2 == 0)
            {
                // Create the secret overlay
                secret c = new secret();
                GreenfootImage q = c.getImage();
                q.scale(600, 400);  // Full-screen effect

                world.addObject(c, 300, 200);  // Add secret overlay once

                // Gradually fade in the secret overlay
                for (int i = 1; i <= 9; i++)
                {
                    q.setTransparency(i * 25);  // Increasing transparency gradually (max 255)
                    Greenfoot.delay(5);  // Pause briefly for effect
                }

                // Add the badge in the center of the screen
                badge a = new badge();
                GreenfootImage b = a.getImage();
                b.scale(b.getWidth() - 320, b.getHeight() - 320);  // Reduce size for badge
                world.addObject(a, 300, 200);

                // Clear the reset counter display
                world.showText(" ", 50, 25);
                ok2 = 1;  // Set the flag to indicate badge has been shown
            }
        }
    }
}

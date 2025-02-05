import greenfoot.*;
public class back extends Actor
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new main());
        }
    }
}

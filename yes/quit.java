import greenfoot.*;
public class quit extends Actor
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }
}

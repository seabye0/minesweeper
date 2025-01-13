import greenfoot.*;
public class nah extends Actor
{
    public boolean touchingWall()
    {
        return isTouching(wall.class);
    }
    public int xwall(Actor nah)
    {
        return nah.getX();
    }
    public int ywall(Actor nah)
    {
        return nah.getY();
    }
    public void act()
    {
        
    }
}

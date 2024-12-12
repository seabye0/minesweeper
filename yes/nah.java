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
        Actor nah;
        MyWorld world=(MyWorld) getWorld();
        nah b = (nah) world.getObjects(nah.class).get(0);
        if (b != null && b.touchingWall())
        {
            world.removeObjects(world.getObjectsAt(xwall(nah.class), ywall(nah.class), wall.class));
        }
    }
}

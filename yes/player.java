import greenfoot.*; 
public class player extends Actor
{
    int ok=1;
    int i=0;
    public void act()
    {
        Actor wall;
        Actor finish;
        Actor nah;
        Actor outside;
        MyWorld world=(MyWorld) getWorld();
        world.showText("Resets: "+i,50,25);
        int playerWidth=getImage().getWidth()/2;
        int playerHeight=getImage().getHeight()/2;
        if(ok==1)
        {
            String key = Greenfoot.getKey();
            if("up".equals(key))
            {
                wall = getOneObjectAtOffset(0,-40,wall.class);
                finish = getOneObjectAtOffset(0,-40,finish.class);
                nah = getOneObjectAtOffset(0,-40,nah.class);
                if(wall!=null||finish!=null)
                {
                    if(nah==null)
                    {
                        setLocation(getX(),getY()-40);
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                    }
                }
            }
            if("down".equals(key))
            {
                wall = getOneObjectAtOffset(0,40,wall.class);
                finish = getOneObjectAtOffset(0,40,finish.class);
                nah = getOneObjectAtOffset(0,40,nah.class);
                if(wall!=null||finish!=null)
                {
                    if(nah==null)
                    {
                        setLocation(getX(),getY()+40);
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                    }
                }
            }
            if("right".equals(key))
            {
                wall = getOneObjectAtOffset(40,0,wall.class);
                finish = getOneObjectAtOffset(40,0,finish.class);
                nah = getOneObjectAtOffset(40,0,nah.class);
                if(wall!=null||finish!=null)
                {
                    if(nah==null)
                    {
                        setLocation(getX()+40,getY());
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                    }
                }
            }
            if("left".equals(key))
            {
                wall = getOneObjectAtOffset(-40,0,wall.class);
                finish = getOneObjectAtOffset(-40,0,finish.class);
                nah = getOneObjectAtOffset(-40,0,nah.class);
                if(wall!=null||finish!=null)
                {
                    if(nah==null)
                    {
                        setLocation(getX()-40,getY());
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                    }
                }
            }
        }
        finish = getOneObjectAtOffset(0,0,finish.class);
        if(finish!=null)
        {
            ok=0;
        }
    }
}

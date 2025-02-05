import greenfoot.*; 
public class player extends Actor
{
    int ok=1;
    int i=0;
    public void act()
    {
        Actor wall;
        Actor badge;
        Actor finish;
        Actor secret;
        MyWorld world=(MyWorld) getWorld();
        world.showText("Resets: "+i,50,25);
        if(ok==1)
        {
            String key = Greenfoot.getKey();
            if("up".equals(key))
            {
                wall = getOneObjectAtOffset(0,-40,wall.class);
                finish = getOneObjectAtOffset(0,-40,finish.class);
                secret = getOneObjectAtOffset(0,-40,secret.class);
                if(wall!=null||finish!=null)
                {
                    if(secret==null)
                    {
                        setLocation(getX(),getY()-40);
                        setRotation(0);
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                        setRotation(0);
                    }
                }
            }
            if("down".equals(key))
            {
                wall = getOneObjectAtOffset(0,40,wall.class);
                finish = getOneObjectAtOffset(0,40,finish.class);
                secret = getOneObjectAtOffset(0,40,secret.class);
                if(wall!=null||finish!=null)
                {
                    if(secret==null)
                    {
                        setLocation(getX(),getY()+40);
                        setRotation(180);
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                        setRotation(0);
                    }
                }
            }
            if("right".equals(key))
            {
                wall = getOneObjectAtOffset(40,0,wall.class);
                finish = getOneObjectAtOffset(40,0,finish.class);
                secret = getOneObjectAtOffset(40,0,secret.class);
                if(wall!=null||finish!=null)
                {
                    if(secret==null)
                    {
                        setLocation(getX()+40,getY());
                        setRotation(90);
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                        setRotation(0);
                    }
                }
            }
            if("left".equals(key))
            {
                wall = getOneObjectAtOffset(-40,0,wall.class);
                finish = getOneObjectAtOffset(-40,0,finish.class);
                secret = getOneObjectAtOffset(-40,0,secret.class);
                if(wall!=null||finish!=null)
                {
                    if(secret==null)
                    {
                        setLocation(getX()-40,getY());
                        setRotation(-90);
                    }
                    else
                    {
                        world.removeObject(wall);
                        setLocation(100,340);
                        i++;
                        setRotation(0);
                    }
                }
            }
        }
        finish = getOneObjectAtOffset(0,0,finish.class);
        badge a=new badge();
        GreenfootImage b=a.getImage();
        b.scale(b.getWidth()-320,b.getHeight()-320);
        secret c=new secret();
        GreenfootImage q=c.getImage();
        q.scale(600,400);
        if(finish!=null)
        {
            ok=0;
            for(int i=1;i<=9;i++)
            {
                world.removeObject(c);
                world.addObject(c,300,200);
                q.setTransparency(i);
            }
            world.addObject(a,300,200);
            world.showText(" ",50,25);
        }
    }
}

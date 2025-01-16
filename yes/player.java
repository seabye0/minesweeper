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
        MyWorld world=(MyWorld) getWorld();
        world.showText("Resets: "+i,50,25);
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
                        setRotation(0);
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
                        setRotation(180);
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
                        setRotation(90);
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
                        setRotation(-90);
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
            world.addNah(180,100);
            world.addNah(220,100);
            world.addNah(300,100);
            world.addNah(380,100);
            world.addNah(460,100);
            world.addNah(220,140);
            world.addNah(340,140);
            world.addNah(380,140);
            world.addNah(460,140);
            world.addNah(140,180);
            world.addNah(140,220);
            world.addNah(180,220);
            world.addNah(260,220);
            world.addNah(340,220);
            world.addNah(380,220);
            world.addNah(460,220);
            world.addNah(220,260);
            world.addNah(340,260);
            world.addNah(380,260);
            world.addNah(420,260);
            world.addNah(180,300);
            world.addNah(220,300);
            world.addNah(260,300);
            world.addNah(380,300);
            world.addNah(420,300);
            world.addNah(500,300);
        }
    }
}

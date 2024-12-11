import greenfoot.*; 
public class player extends Actor
{
    int ok=1;
    public void act()
    {
        Actor wall;
        Actor finish;
        int playerWidth=getImage().getWidth()/2;
        int playerHeight=getImage().getHeight()/2;
        if(ok==1)
        {
            String key = Greenfoot.getKey();
            if("up".equals(key))
            {
                wall = getOneObjectAtOffset(0,-40,wall.class);
                finish = getOneObjectAtOffset(0,-40,finish.class);
                if(wall!=null||finish!=null)
                {
                    setLocation(getX(),getY()-40);
                }
            }
            if("down".equals(key))
            {
                wall = getOneObjectAtOffset(0,40,wall.class);
                finish = getOneObjectAtOffset(0,40,finish.class);
                if(wall!=null||finish!=null)
                {
                    setLocation(getX(),getY()+40);
                }
            }
            if("right".equals(key))
            {
                wall = getOneObjectAtOffset(40,0,wall.class);
                finish = getOneObjectAtOffset(40,0,finish.class);
                if(wall!=null||finish!=null)
                {
                    setLocation(getX()+40,getY());
                }
            }
            if("left".equals(key))
            {
                wall = getOneObjectAtOffset(-40,0,wall.class);
                finish = getOneObjectAtOffset(-40,0,finish.class);
                if(wall!=null||finish!=null)
                {
                    setLocation(getX()-40,getY());
                }
            }
        }
        else
        {
            
        }
        finish = getOneObjectAtOffset(0,0,finish.class);
        if(finish!=null)
        {
            ok=0;
        }
    }
}

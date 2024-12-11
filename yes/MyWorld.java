import greenfoot.*;
public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1); 
        prepare();
    }
    public void prepare()
    {
        for(int i=0;i<11;i++)
        {
            addWall(100+i*40,100);
        }
        for(int i=0;i<11;i++)
        {
            addWall(100+i*40,140);
        }
        for(int i=0;i<11;i++)
        {
            addWall(100+i*40,180);
        }
        for(int i=0;i<11;i++)
        {
            addWall(100+i*40,220);
        }
        for(int i=0;i<11;i++)
        {
            addWall(100+i*40,260);
        }
        for(int i=0;i<11;i++)
        {
            addWall(100+i*40,300);
        }
        for(int i=0;i<15;i++)
        {
            addOutside(20+i*40,20);
        }
        for(int i=0;i<15;i++)
        {
            addOutside(20+i*40,60);
        }
        for(int i=0;i<15;i++)
        {
            if(i!=2)
            {
                addOutside(20+i*40,340);
            }
        }
        for(int i=0;i<15;i++)
        {
            addOutside(20+i*40,380);
        }
        for(int i=2;i<8;i++)
        {
            addOutside(20,20+i*40);
        }
        for(int i=2;i<8;i++)
        {
            addOutside(60,20+i*40);
        }
        for(int i=3;i<8;i++)
        {
            addOutside(540,20+i*40);
        }
        for(int i=2;i<8;i++)
        {
            addOutside(580,20+i*40);
        }
        finish w = new finish();
        GreenfootImage c = w.getImage();
        c.scale(40,40);
        w.setImage(c);
        addObject(w,540,100);
        start q = new start();
        c = q.getImage();
        c.scale(40,40);
        q.setImage(c);
        addObject(q,100,340);
        player a=new player();
        c = a.getImage();
        c.scale(32,40);
        a.setImage(c);
        addObject(a,100,340);
    }
    public void addWall(int x,int y)
    {
        wall b=new wall();
        GreenfootImage c = b.getImage();
        c.scale(40,40);
        b.setImage(c);
        addObject(b,x,y);
    }
    public void addOutside(int x,int y)
    {
        outside b=new outside();
        GreenfootImage c = b.getImage();
        c.scale(40,40);
        b.setImage(c);
        addObject(b,x,y);
    }
}

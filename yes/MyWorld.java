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
        //I add the secret walls that will teleport the player back.
        addSecret(180,100);
        addSecret(220,100);
        addSecret(300,100);
        addSecret(380,100);
        addSecret(460,100);
        addSecret(220,140);
        addSecret(340,140);
        addSecret(380,140);
        addSecret(460,140);
        addSecret(140,180);
        addSecret(140,220);
        addSecret(180,220);
        addSecret(260,220);
        addSecret(340,220);
        addSecret(380,220);
        addSecret(460,220);
        addSecret(220,260);
        addSecret(340,260);
        addSecret(380,260);
        addSecret(420,260);
        addSecret(180,300);
        addSecret(220,300);
        addSecret(260,300);
        addSecret(380,300);
        addSecret(420,300);
        addSecret(500,300);
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
    public void addSecret(int x,int y)
    {
        secret a=new secret();
        addObject(a,x,y);
    }
}

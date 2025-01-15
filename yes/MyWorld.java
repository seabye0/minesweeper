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
        addNah(180,100);
        addNah(220,100);
        addNah(300,100);
        addNah(380,100);
        addNah(460,100);
        addNah(220,140);
        addNah(340,140);
        addNah(380,140);
        addNah(460,140);
        addNah(140,180);
        addNah(140,220);
        addNah(180,220);
        addNah(260,220);
        addNah(340,220);
        addNah(380,220);
        addNah(460,220);
        addNah(220,260);
        addNah(340,260);
        addNah(380,260);
        addNah(420,260);
        addNah(180,300);
        addNah(220,300);
        addNah(260,300);
        addNah(380,300);
        addNah(420,300);
        addNah(500,300);
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
    public void addNah(int x,int y)
    {
        nah a=new nah();
        addObject(a,x,y);
    }
}

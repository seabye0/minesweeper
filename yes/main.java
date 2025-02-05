import greenfoot.*;
public class main extends World
{
    public main()
    {    
        super(600, 400, 1);
        prepare();
    }
    public void prepare()
    {
        play b=new play();
        GreenfootImage c = b.getImage();
        c.scale(90,30);
        b.setImage(c);
        addObject(b,110,210);
        how a=new how();
        c = a.getImage();
        c.scale(90,30);
        a.setImage(c);
        addObject(a,110,250);
        quit d=new quit();
        c = d.getImage();
        c.scale(90,30);
        d.setImage(c);
        addObject(d,110,290);
    }
}

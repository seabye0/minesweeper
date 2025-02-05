import greenfoot.*;
public class howtoplay extends World
{
    public howtoplay()
    {    
        super(600, 400, 1);
        prepare();
    }
    public void prepare()
    {
        back b=new back();
        GreenfootImage c = b.getImage();
        c.scale(90,30);
        b.setImage(c);
        addObject(b,90,350);
    }
}

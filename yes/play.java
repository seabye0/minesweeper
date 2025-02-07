import greenfoot.*;  

// Clasa "play" extinde Actor
// acsta este codul pentru butonul "Play", care începe jocul
public class play extends Actor
{
    public void act()
    {
        // verificăm dacă butonul a fost apăsat de utilizator cu mouse-ul
        if (Greenfoot.mouseClicked(this))
        {
            //  schimbă lumea la "MyWorld" (începerea jocului)
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

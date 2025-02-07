import greenfoot.*; 

// Clasa "back" extinde Actor
// acesta este codul pentru butonul de întoarcere la meniul principal
public class back extends Actor
{
    public void act()
    {
        // verificăm dacă acest buton a fost apăsat de utilizator cu mouse-ul
        if (Greenfoot.mouseClicked(this))
        {
            // dacă a fost apăsat, schimbă lumea la meniul principal
            Greenfoot.setWorld(new main());
        }
    }
}
